package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpot;

public interface ScenicSpotMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(ScenicSpot record);

    int insertSelective(ScenicSpot record);

    ScenicSpot selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(ScenicSpot record);

    int updateByPrimaryKey(ScenicSpot record);
}