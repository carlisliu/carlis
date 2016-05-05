package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.Dishes;

public interface DishesMapper {
    int deleteByPrimaryKey(Integer dishesId);

    int insert(Dishes record);

    int insertSelective(Dishes record);

    Dishes selectByPrimaryKey(Integer dishesId);

    int updateByPrimaryKeySelective(Dishes record);

    int updateByPrimaryKey(Dishes record);
}