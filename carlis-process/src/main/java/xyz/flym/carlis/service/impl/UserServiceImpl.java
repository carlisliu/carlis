package xyz.flym.carlis.service.impl;

import java.util.List;

import com.github.pagehelper.PageHelper;

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
		List<User> users = userMapper.findBy(new User(loginId));
		return users == null || users.isEmpty() ? null : users.get(0);
	}

	@Override
	public void updatePassword(String loginId, String newPassword) {
		userMapper.updatePassword(loginId, newPassword);
	}

	@Override
	public List<User> findUserByPager(int page, int pageSize) {
		PageHelper.startPage(page, pageSize);
		return userMapper.getAll();
	}
	
	@Override
	public List<User> simpleGetAll() {
		return userMapper.getAll();
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

}
