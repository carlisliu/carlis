package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.UsersInfo;

public interface UsersInfoMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(UsersInfo record);

    int insertSelective(UsersInfo record);

    UsersInfo selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(UsersInfo record);

    int updateByPrimaryKey(UsersInfo record);
}