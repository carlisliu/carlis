package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotHotelRela;

public interface ScenicSpotHotelRelaMapper {
    int deleteByPrimaryKey(int key);

    int insert(ScenicSpotHotelRela record);

    int insertSelective(ScenicSpotHotelRela record);

    ScenicSpotHotelRela selectByPrimaryKey(int key);

    int updateByPrimaryKeySelective(ScenicSpotHotelRela record);

    int updateByPrimaryKey(ScenicSpotHotelRela record);
}