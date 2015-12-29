package xyz.flym.carlis.web.action.admin;

import java.util.List;

import xyz.flym.carlis.persistence.domain.User;
import xyz.flym.carlis.service.UserService;

import com.opensymphony.xwork2.Action;

/**
 * 
 * @author Carlis
 * 
 */
public class UserAction extends SecurityBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserService userService;
	private List<User> users;

	/**
	 * 
	 */
	public String execute() {
		this.users = userService.findAllUsers();
		return Action.SUCCESS;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
