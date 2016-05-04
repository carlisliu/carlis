package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotUserImages;

public interface ScenicSpotUserImagesMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(ScenicSpotUserImages record);

    int insertSelective(ScenicSpotUserImages record);

    ScenicSpotUserImages selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(ScenicSpotUserImages record);

    int updateByPrimaryKey(ScenicSpotUserImages record);
}