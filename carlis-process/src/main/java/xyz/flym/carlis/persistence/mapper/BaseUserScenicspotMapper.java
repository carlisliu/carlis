package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseUserScenicspot;

public interface BaseUserScenicspotMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(BaseUserScenicspot record);

    int insertSelective(BaseUserScenicspot record);

    BaseUserScenicspot selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(BaseUserScenicspot record);

    int updateByPrimaryKey(BaseUserScenicspot record);
}