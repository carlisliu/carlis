package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.Restaurant;

public interface RestaurantMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(Restaurant record);

    int insertSelective(Restaurant record);

    Restaurant selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(Restaurant record);

    int updateByPrimaryKey(Restaurant record);
}