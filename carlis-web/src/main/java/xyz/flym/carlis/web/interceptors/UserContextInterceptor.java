package xyz.flym.carlis.web.interceptors;

import java.util.Map;

import xyz.flym.carlis.persistence.domain.User;
import xyz.flym.carlis.utils.security.LoginContextHolder;
import xyz.flym.carlis.web.utils.Const;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 
 * @author Carlis
 * 
 */
public class UserContextInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> sessionContent = invocation.getInvocationContext().getSession();
		if (sessionContent != null) {
			User user = (User) sessionContent.get(Const.LOGIN_USER_SESSION_IDENTIFIER);
			if (user != null) {
				// get login user's info and set it to current thread's context.
				LoginContextHolder.put(user);
				String result = invocation.invoke();
				LoginContextHolder.clear();
				return result;
			}
		}
		return Action.LOGIN;
	}

}
