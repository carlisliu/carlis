package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.HotelService;

public interface HotelServiceMapper {
    int deleteByPrimaryKey(Integer hotelServiceId);

    int insert(HotelService record);

    int insertSelective(HotelService record);

    HotelService selectByPrimaryKey(Integer hotelServiceId);

    int updateByPrimaryKeySelective(HotelService record);

    int updateByPrimaryKey(HotelService record);
}