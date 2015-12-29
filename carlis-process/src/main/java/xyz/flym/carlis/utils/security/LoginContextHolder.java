package xyz.flym.carlis.utils.security;

import xyz.flym.carlis.persistence.domain.User;

/**
 * 
 * @author Carlis
 * 
 */
public class LoginContextHolder {
	private static final ThreadLocal<User> holder = new ThreadLocal<User>();

	public static void put(User user) {
		if (user == null) {
			throw new RuntimeException("Login user info is empty, can not be set.");
		}
		holder.set(user);
	}

	public static void clear() {
		holder.remove();
	}

	public static User get() {
		return holder.get();
	}
}
