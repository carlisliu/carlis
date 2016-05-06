package xyz.flym.carlis.service.impl;

import java.util.List;

import xyz.flym.carlis.persistence.domain.BaseAdminuserinfo;
import xyz.flym.carlis.persistence.mapper.BaseAdminuserinfoMapper;
import xyz.flym.carlis.service.UserService;

/**
 * 
 * @author Carlis
 * 
 */
public class UserServiceImpl implements UserService {

	// Injected by spring.
	private BaseAdminuserinfoMapper baseAdminuserinfoMapper;

	/**
	 * find user.
	 */
	@Override
	public BaseAdminuserinfo findUser(String loginId) {
		List<BaseAdminuserinfo> users = baseAdminuserinfoMapper.findBy(new BaseAdminuserinfo(loginId));
		return users == null || users.isEmpty() ? null : users.get(0);
	}

	public BaseAdminuserinfoMapper getBaseAdminuserinfoMapper() {
		return baseAdminuserinfoMapper;
	}

	public void setBaseAdminuserinfoMapper(BaseAdminuserinfoMapper baseAdminuserinfoMapper) {
		this.baseAdminuserinfoMapper = baseAdminuserinfoMapper;
	}

	/*
	 * @Override public List<User> findUserByPager(int page, int pageSize) {
	 * PageHelper.startPage(page, pageSize); return userMapper.getAll(); }
	 */

}
