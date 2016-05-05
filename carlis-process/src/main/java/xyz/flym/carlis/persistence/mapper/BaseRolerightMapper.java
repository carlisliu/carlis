package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseRoleright;

public interface BaseRolerightMapper {
    int deleteByPrimaryKey(String rolerightId);

    int insert(BaseRoleright record);

    int insertSelective(BaseRoleright record);

    BaseRoleright selectByPrimaryKey(String rolerightId);

    int updateByPrimaryKeySelective(BaseRoleright record);

    int updateByPrimaryKey(BaseRoleright record);
}