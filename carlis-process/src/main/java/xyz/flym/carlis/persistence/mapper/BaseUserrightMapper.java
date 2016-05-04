package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseUserright;

public interface BaseUserrightMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(BaseUserright record);

    int insertSelective(BaseUserright record);

    BaseUserright selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(BaseUserright record);

    int updateByPrimaryKey(BaseUserright record);
}