package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotImages;

public interface ScenicSpotImagesMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(ScenicSpotImages record);

    int insertSelective(ScenicSpotImages record);

    ScenicSpotImages selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(ScenicSpotImages record);

    int updateByPrimaryKey(ScenicSpotImages record);
}