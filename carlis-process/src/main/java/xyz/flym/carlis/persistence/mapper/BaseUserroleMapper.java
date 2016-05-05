package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseUserrole;

public interface BaseUserroleMapper {
    int deleteByPrimaryKey(String userroleId);

    int insert(BaseUserrole record);

    int insertSelective(BaseUserrole record);

    BaseUserrole selectByPrimaryKey(String userroleId);

    int updateByPrimaryKeySelective(BaseUserrole record);

    int updateByPrimaryKey(BaseUserrole record);
}