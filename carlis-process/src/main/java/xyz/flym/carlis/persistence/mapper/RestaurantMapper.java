package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.Restaurant;

public interface RestaurantMapper {
    int deleteByPrimaryKey(Integer restaurantId);

    int insert(Restaurant record);

    int insertSelective(Restaurant record);

    Restaurant selectByPrimaryKey(Integer restaurantId);

    int updateByPrimaryKeySelective(Restaurant record);

    int updateByPrimaryKey(Restaurant record);
}