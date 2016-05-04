package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.CityImages;

public interface CityImagesMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(CityImages record);

    int insertSelective(CityImages record);

    CityImages selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(CityImages record);

    int updateByPrimaryKey(CityImages record);
}