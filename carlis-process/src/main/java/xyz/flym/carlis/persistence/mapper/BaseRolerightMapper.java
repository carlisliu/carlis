package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseRoleright;

public interface BaseRolerightMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(BaseRoleright record);

    int insertSelective(BaseRoleright record);

    BaseRoleright selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(BaseRoleright record);

    int updateByPrimaryKey(BaseRoleright record);
}