package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseUserright;

public interface BaseUserrightMapper {
    int deleteByPrimaryKey(String userrightId);

    int insert(BaseUserright record);

    int insertSelective(BaseUserright record);

    BaseUserright selectByPrimaryKey(String userrightId);

    int updateByPrimaryKeySelective(BaseUserright record);

    int updateByPrimaryKey(BaseUserright record);
}