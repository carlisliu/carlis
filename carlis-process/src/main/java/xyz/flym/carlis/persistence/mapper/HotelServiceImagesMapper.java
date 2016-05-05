package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.HotelServiceImages;

public interface HotelServiceImagesMapper {
    int deleteByPrimaryKey(Integer hotelServiceImagesId);

    int insert(HotelServiceImages record);

    int insertSelective(HotelServiceImages record);

    HotelServiceImages selectByPrimaryKey(Integer hotelServiceImagesId);

    int updateByPrimaryKeySelective(HotelServiceImages record);

    int updateByPrimaryKey(HotelServiceImages record);
}