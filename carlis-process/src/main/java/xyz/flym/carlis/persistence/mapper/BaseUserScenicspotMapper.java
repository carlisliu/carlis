package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseUserScenicspot;

public interface BaseUserScenicspotMapper {
    int insert(BaseUserScenicspot record);

    int insertSelective(BaseUserScenicspot record);
}