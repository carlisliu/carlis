package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.CityImages;

public interface CityImagesMapper {
    int deleteByPrimaryKey(Integer cityImagesId);

    int insert(CityImages record);

    int insertSelective(CityImages record);

    CityImages selectByPrimaryKey(Integer cityImagesId);

    int updateByPrimaryKeySelective(CityImages record);

    int updateByPrimaryKey(CityImages record);
}