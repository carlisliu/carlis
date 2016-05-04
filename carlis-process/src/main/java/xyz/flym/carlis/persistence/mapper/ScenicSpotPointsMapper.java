package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotPoints;

public interface ScenicSpotPointsMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(ScenicSpotPoints record);

    int insertSelective(ScenicSpotPoints record);

    ScenicSpotPoints selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(ScenicSpotPoints record);

    int updateByPrimaryKey(ScenicSpotPoints record);
}