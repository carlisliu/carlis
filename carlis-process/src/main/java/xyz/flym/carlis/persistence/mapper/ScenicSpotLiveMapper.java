package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotLive;

public interface ScenicSpotLiveMapper {
    int deleteByPrimaryKey(Integer scenicSpotLiveId);

    int insert(ScenicSpotLive record);

    int insertSelective(ScenicSpotLive record);

    ScenicSpotLive selectByPrimaryKey(Integer scenicSpotLiveId);

    int updateByPrimaryKeySelective(ScenicSpotLive record);

    int updateByPrimaryKey(ScenicSpotLive record);
}