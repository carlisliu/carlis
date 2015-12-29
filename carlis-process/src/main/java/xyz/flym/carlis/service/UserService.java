package xyz.flym.carlis.service;

import java.util.List;

import xyz.flym.carlis.persistence.domain.User;

/**
 * 
 * @author Carlis
 * 
 */
public interface UserService {

	/**
	 * Find user by its login id.
	 * 
	 * @param loginId
	 * @return
	 */
	User findUser(String loginId);

	/**
	 * Find all users.
	 * 
	 * @return
	 */
	List<User> findAllUsers();

	/**
	 * Update password
	 * 
	 * @param loginId
	 * @param newPassword
	 */
	void updatePassword(String loginId, String newPassword);

}
