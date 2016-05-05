package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.LandscapeImages;

public interface LandscapeImagesMapper {
    int deleteByPrimaryKey(Integer landscapeImagesId);

    int insert(LandscapeImages record);

    int insertSelective(LandscapeImages record);

    LandscapeImages selectByPrimaryKey(Integer landscapeImagesId);

    int updateByPrimaryKeySelective(LandscapeImages record);

    int updateByPrimaryKey(LandscapeImages record);
}