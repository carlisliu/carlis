package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.HotelServiceImages;

public interface HotelServiceImagesMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(HotelServiceImages record);

    int insertSelective(HotelServiceImages record);

    HotelServiceImages selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(HotelServiceImages record);

    int updateByPrimaryKey(HotelServiceImages record);
}