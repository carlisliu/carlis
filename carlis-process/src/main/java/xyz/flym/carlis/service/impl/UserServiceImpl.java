package xyz.flym.carlis.service.impl;

import java.util.List;

import xyz.flym.carlis.persistence.domain.User;
import xyz.flym.carlis.persistence.mapper.UserMapper;
import xyz.flym.carlis.service.UserService;

/**
 * 
 * @author Carlis
 * 
 */
public class UserServiceImpl implements UserService {

	// Injected by spring.
	private UserMapper userMapper;

	/**
	 * find user.
	 */
	@Override
	public User findUser(String loginId) {
		return userMapper.findUserByLoginId(loginId);
	}

	/**
	 * 
	 */
	@Override
	public List<User> findAllUsers() {
		return userMapper.findAllUsers();
	}

	@Override
	public void updatePassword(String loginId, String newPassword) {
		userMapper.updatePassword(loginId, newPassword);
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

}
