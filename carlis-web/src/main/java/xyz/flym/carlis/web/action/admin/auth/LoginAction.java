package xyz.flym.carlis.web.action.admin.auth;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import xyz.flym.carlis.persistence.domain.BaseAdminuserinfo;
import xyz.flym.carlis.service.UserService;
import xyz.flym.carlis.utils.security.Encrypt;
import xyz.flym.carlis.web.action.admin.SecurityBaseAction;
import xyz.flym.carlis.web.utils.Const;

/**
 * 
 * @author Carlis
 * 
 */
public class LoginAction extends SecurityBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String loginId;
	private String password;

	private UserService userService;

	/**
	 * Login to the system.
	 * 
	 * @return
	 */
	public String execute() {
		BaseAdminuserinfo user = userService.findUser(this.loginId);
		if (user == null) {
			this.addActionError("该登录ID未注册");
			return Action.INPUT;
		}
		if (!Encrypt.MD5(this.password).equals(user.getUserPwd())) {
			this.addActionError("密码错误");
			return Action.INPUT;
		}
		if (user.getScenicSports() == null || user.getScenicSports().isEmpty()) {
			this.addActionError("该用户未关联任何景点，请联系系统管理员");
			return Action.INPUT;
		}
		ActionContext.getContext().getSession().put(Const.LOGIN_USER_SESSION_IDENTIFIER, user);
		return Action.SUCCESS;
	}

	@Override
	public void validate() {
		if (StringUtils.isEmpty(this.loginId)) {
			this.addFieldError("loginId", "登录账号为空");
			return;
		}
		if (StringUtils.isEmpty(this.password)) {
			this.addFieldError("password", "密码为空");
		}
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
