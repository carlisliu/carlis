package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.CountyImages;

public interface CountyImagesMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(CountyImages record);

    int insertSelective(CountyImages record);

    CountyImages selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(CountyImages record);

    int updateByPrimaryKey(CountyImages record);
}