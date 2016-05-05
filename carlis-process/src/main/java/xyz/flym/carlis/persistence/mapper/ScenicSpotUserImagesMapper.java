package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotUserImages;

public interface ScenicSpotUserImagesMapper {
    int deleteByPrimaryKey(Integer scenicSpotUserImagesId);

    int insert(ScenicSpotUserImages record);

    int insertSelective(ScenicSpotUserImages record);

    ScenicSpotUserImages selectByPrimaryKey(Integer scenicSpotUserImagesId);

    int updateByPrimaryKeySelective(ScenicSpotUserImages record);

    int updateByPrimaryKey(ScenicSpotUserImages record);
}