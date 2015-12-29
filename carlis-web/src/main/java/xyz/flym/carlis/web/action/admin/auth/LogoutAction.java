package xyz.flym.carlis.web.action.admin.auth;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import xyz.flym.carlis.web.action.admin.SecurityBaseAction;
import xyz.flym.carlis.web.utils.Const;
import xyz.flym.carlis.web.utils.ServletContextHelper;

/**
 * Logout System Action.
 * 
 * @author Carlis
 * 
 */
public class LogoutAction extends SecurityBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * logout system.
	 * 
	 * @return
	 */
	public String execute() {
		ActionContext.getContext().getSession().remove(Const.LOGIN_USER_SESSION_IDENTIFIER);
		ServletContextHelper.remove(ServletActionContext.getServletContext(), "company");
		return Action.SUCCESS;
	}

}
