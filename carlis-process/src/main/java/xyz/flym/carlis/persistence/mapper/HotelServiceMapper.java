package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.HotelService;

public interface HotelServiceMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(HotelService record);

    int insertSelective(HotelService record);

    HotelService selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(HotelService record);

    int updateByPrimaryKey(HotelService record);
}