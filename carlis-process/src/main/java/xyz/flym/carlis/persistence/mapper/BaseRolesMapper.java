package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseRoles;

public interface BaseRolesMapper {
    int deleteByPrimaryKey(String rolesId);

    int insert(BaseRoles record);

    int insertSelective(BaseRoles record);

    BaseRoles selectByPrimaryKey(String rolesId);

    int updateByPrimaryKeySelective(BaseRoles record);

    int updateByPrimaryKey(BaseRoles record);
}