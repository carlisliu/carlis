package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}