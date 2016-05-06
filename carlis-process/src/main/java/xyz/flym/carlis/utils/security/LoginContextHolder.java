package xyz.flym.carlis.utils.security;

import xyz.flym.carlis.persistence.domain.UserContext;

/**
 * 
 * @author Carlis
 * 
 */
public class LoginContextHolder {
	private static final ThreadLocal<UserContext> holder = new ThreadLocal<UserContext>();

	public static void put(UserContext userContext) {
		if (userContext == null) {
			throw new RuntimeException("Login user info is empty, can not be set.");
		}
		holder.set(userContext);
	}

	public static void clear() {
		holder.remove();
	}

	public static UserContext getUserContext() {
		return holder.get();
	}
}
