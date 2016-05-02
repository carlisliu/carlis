package xyz.flym.carlis.service;

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
	 * Update password
	 * 
	 * @param loginId
	 * @param newPassword
	 */
	void updatePassword(String loginId, String newPassword);

}
