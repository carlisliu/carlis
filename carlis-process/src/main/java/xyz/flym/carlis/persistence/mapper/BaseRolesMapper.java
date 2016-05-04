package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseRoles;

public interface BaseRolesMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(BaseRoles record);

    int insertSelective(BaseRoles record);

    BaseRoles selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(BaseRoles record);

    int updateByPrimaryKey(BaseRoles record);
}