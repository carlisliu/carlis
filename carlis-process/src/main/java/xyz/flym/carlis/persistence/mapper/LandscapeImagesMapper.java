package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.LandscapeImages;

public interface LandscapeImagesMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(LandscapeImages record);

    int insertSelective(LandscapeImages record);

    LandscapeImages selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(LandscapeImages record);

    int updateByPrimaryKey(LandscapeImages record);
}