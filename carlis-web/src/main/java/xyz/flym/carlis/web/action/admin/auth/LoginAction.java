package xyz.flym.carlis.web.action.admin.auth;

import javax.servlet.ServletContext;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import xyz.flym.carlis.persistence.domain.User;
import xyz.flym.carlis.service.CompanyService;
import xyz.flym.carlis.service.UserService;
import xyz.flym.carlis.utils.security.Encrypt;
import xyz.flym.carlis.web.action.admin.SecurityBaseAction;
import xyz.flym.carlis.web.utils.Const;
import xyz.flym.carlis.web.utils.ServletContextHelper;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

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
	private CompanyService companyService;

	/**
	 * Login to the system.
	 * 
	 * @return
	 */
	public String execute() {
		User user = userService.findUser(this.loginId);
		if (user == null) {
			this.addActionError("该登录ID未注册");
			return Action.INPUT;
		}
		if (!Encrypt.MD5(this.password).equals(user.getPassword())) {
			this.addActionError("密码错误");
			return Action.INPUT;
		}
		ActionContext.getContext().getSession().put(Const.LOGIN_USER_SESSION_IDENTIFIER, user);
		ServletContext servletContext = (ServletContext) ActionContext.getContext().get(
				ServletActionContext.SERVLET_CONTEXT);
		if (servletContext.getAttribute("company") == null) {
			ServletContextHelper.set(servletContext, companyService.getCompany());
		}
		return Action.SUCCESS;
	}

	@Override
	public void validate() {
		if (StringUtils.isEmpty(this.loginId)) {
			this.addFieldError("loginId", this.getText("", "登录ID"));
			return;
		}
		if (StringUtils.isEmpty(this.password)) {
			this.addFieldError("password", this.getText("", "密码"));
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

	public CompanyService getCompanyService() {
		return companyService;
	}

	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}

}