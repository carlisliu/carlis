package xyz.flym.carlis.service;

import xyz.flym.carlis.persistence.domain.BaseAdminuserinfo;

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
	BaseAdminuserinfo findUser(String loginId);

}
