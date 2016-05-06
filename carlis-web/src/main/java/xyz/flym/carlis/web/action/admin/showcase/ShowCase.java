package xyz.flym.carlis.web.action.admin.showcase;

import java.util.List;

import com.opensymphony.xwork2.Action;

import xyz.flym.carlis.persistence.domain.User;
import xyz.flym.carlis.service.UserService;
import xyz.flym.carlis.web.action.admin.SecurityBaseAction;

public class ShowCase extends SecurityBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int page;
	private int pageSize;
	private List<User> users;
	private UserService userService;

	/**
	 * Redirect.
	 */
	public String execute() {
		return Action.SUCCESS;
	}

	public String testPager() {
		System.out.println(this.page);
		System.out.println(this.pageSize);
		//this.users = userService.findUserByPager(this.page, this.pageSize);
		return Action.SUCCESS;
	}

	public String testNoPager() {
		System.out.println(this.page);
		System.out.println(this.pageSize);
		//this.users = userService.simpleGetAll();
		return Action.SUCCESS;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
