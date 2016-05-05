package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotActivity;

public interface ScenicSpotActivityMapper {
    int deleteByPrimaryKey(Integer scenicSpotActivityId);

    int insert(ScenicSpotActivity record);

    int insertSelective(ScenicSpotActivity record);

    ScenicSpotActivity selectByPrimaryKey(Integer scenicSpotActivityId);

    int updateByPrimaryKeySelective(ScenicSpotActivity record);

    int updateByPrimaryKey(ScenicSpotActivity record);
}