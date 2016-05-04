package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.Hotel;

public interface HotelMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(Hotel record);

    int insertSelective(Hotel record);

    Hotel selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(Hotel record);

    int updateByPrimaryKey(Hotel record);
}