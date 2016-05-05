package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotImages;

public interface ScenicSpotImagesMapper {
    int deleteByPrimaryKey(Integer scenicSpotImagesId);

    int insert(ScenicSpotImages record);

    int insertSelective(ScenicSpotImages record);

    ScenicSpotImages selectByPrimaryKey(Integer scenicSpotImagesId);

    int updateByPrimaryKeySelective(ScenicSpotImages record);

    int updateByPrimaryKey(ScenicSpotImages record);
}