package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotPoints;

public interface ScenicSpotPointsMapper {
    int deleteByPrimaryKey(Long scenicSpotPointsId);

    int insert(ScenicSpotPoints record);

    int insertSelective(ScenicSpotPoints record);

    ScenicSpotPoints selectByPrimaryKey(Long scenicSpotPointsId);

    int updateByPrimaryKeySelective(ScenicSpotPoints record);

    int updateByPrimaryKey(ScenicSpotPoints record);
}