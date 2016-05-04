package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotHotelRela;

public interface ScenicSpotHotelRelaMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(ScenicSpotHotelRela record);

    int insertSelective(ScenicSpotHotelRela record);

    ScenicSpotHotelRela selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(ScenicSpotHotelRela record);

    int updateByPrimaryKey(ScenicSpotHotelRela record);
}