package xyz.flym.carlis.web.action.admin.auth;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;

import xyz.flym.carlis.persistence.domain.User;
import xyz.flym.carlis.service.UserService;
import xyz.flym.carlis.utils.security.Encrypt;
import xyz.flym.carlis.web.action.admin.SecurityBaseAction;
import xyz.flym.carlis.web.utils.Const;

import com.opensymphony.xwork2.Action;

/**
 * 
 * @author Carlis
 * 
 */
public class UserSettingAction extends SecurityBaseAction implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String original;
	private String newPassword;
	private String newPasswordDuplication;

	private UserService userService;
	private Map<String, Object> session;

	/**
	 * 
	 */
	public String execute() {
		if (validatePassword()) {
			if (!newPasswordDuplication.equals(newPassword)) {
				this.addJsonExecutionError("两次输入的新密码不一致");
			} else {
				User loginUser = (User) session.get(Const.LOGIN_USER_SESSION_IDENTIFIER);
				if (loginUser == null) {
					return Action.LOGIN;
				}
				loginUser = userService.findUser(loginUser.getLoginId());
				if (loginUser == null) {
					this.addJsonExecutionError("当前用户不存在");
				} else {
					String encrypted = Encrypt.MD5(newPassword);
					if (encrypted.equals(loginUser.getPassword())) {
						this.addJsonExecutionError("新旧密码不能相同");
					} else {
						userService.updatePassword(loginUser.getLoginId(), encrypted);
					}
				}
			}
		} else {
			this.addJsonExecutionError("密码不能为空");
		}
		return Action.SUCCESS;
	}

	private boolean validatePassword() {
		return StringUtils.isNotEmpty(original) && StringUtils.isNotEmpty(newPassword)
				&& StringUtils.isNotEmpty(newPassword);
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getNewPasswordDuplication() {
		return newPasswordDuplication;
	}

	public void setNewPasswordDuplication(String newPasswordDuplication) {
		this.newPasswordDuplication = newPasswordDuplication;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
