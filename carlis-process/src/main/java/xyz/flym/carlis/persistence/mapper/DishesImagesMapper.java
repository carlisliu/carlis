package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.DishesImages;

public interface DishesImagesMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(DishesImages record);

    int insertSelective(DishesImages record);

    DishesImages selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(DishesImages record);

    int updateByPrimaryKey(DishesImages record);
}