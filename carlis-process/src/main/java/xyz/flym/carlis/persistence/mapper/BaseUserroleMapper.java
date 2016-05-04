package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseUserrole;

public interface BaseUserroleMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(BaseUserrole record);

    int insertSelective(BaseUserrole record);

    BaseUserrole selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(BaseUserrole record);

    int updateByPrimaryKey(BaseUserrole record);
}