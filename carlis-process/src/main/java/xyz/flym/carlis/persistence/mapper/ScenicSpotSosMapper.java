package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotSos;

public interface ScenicSpotSosMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(ScenicSpotSos record);

    int insertSelective(ScenicSpotSos record);

    ScenicSpotSos selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(ScenicSpotSos record);

    int updateByPrimaryKey(ScenicSpotSos record);
}