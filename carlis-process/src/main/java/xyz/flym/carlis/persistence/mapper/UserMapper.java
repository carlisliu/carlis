package xyz.flym.carlis.persistence.mapper;

import org.apache.ibatis.annotations.Param;

import xyz.flym.carlis.persistence.domain.User;

/**
 * 
 * @author Carlis
 * 
 */
public interface UserMapper extends BaseMapper<User, Long> {

	/**
	 * 
	 * @param loginId
	 * @param newPassword
	 */
	void updatePassword(@Param("loginId") String loginId, @Param("newPassword") String newPassword);

}
