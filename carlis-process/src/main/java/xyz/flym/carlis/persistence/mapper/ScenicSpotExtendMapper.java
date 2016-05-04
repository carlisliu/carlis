package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotExtend;

public interface ScenicSpotExtendMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(ScenicSpotExtend record);

    int insertSelective(ScenicSpotExtend record);

    ScenicSpotExtend selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(ScenicSpotExtend record);

    int updateByPrimaryKey(ScenicSpotExtend record);
}