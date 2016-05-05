package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.DishesImages;

public interface DishesImagesMapper {
    int deleteByPrimaryKey(Integer dishesImagesId);

    int insert(DishesImages record);

    int insertSelective(DishesImages record);

    DishesImages selectByPrimaryKey(Integer dishesImagesId);

    int updateByPrimaryKeySelective(DishesImages record);

    int updateByPrimaryKey(DishesImages record);
}