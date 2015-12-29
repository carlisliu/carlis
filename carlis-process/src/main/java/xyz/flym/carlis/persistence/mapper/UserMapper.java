package xyz.flym.carlis.persistence.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import xyz.flym.carlis.persistence.domain.User;

/**
 * 
 * @author Carlis
 * 
 */
public interface UserMapper {

	/**
	 * 
	 * @param loginId
	 * @return
	 */
	User findUserByLoginId(String loginId);

	/**
	 * 
	 * @return
	 */
	List<User> findAllUsers();

	/**
	 * 
	 * @param loginId
	 * @param newPassword
	 */
	void updatePassword(@Param("loginId") String loginId, @Param("newPassword") String newPassword);

}
