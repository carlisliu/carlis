package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.Dishes;

public interface DishesMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(Dishes record);

    int insertSelective(Dishes record);

    Dishes selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(Dishes record);

    int updateByPrimaryKey(Dishes record);
}