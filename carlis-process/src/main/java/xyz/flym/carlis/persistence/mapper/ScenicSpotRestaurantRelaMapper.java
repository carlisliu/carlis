package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotRestaurantRela;

public interface ScenicSpotRestaurantRelaMapper {
    int deleteByPrimaryKey(int key);

    int insert(ScenicSpotRestaurantRela record);

    int insertSelective(ScenicSpotRestaurantRela record);

    ScenicSpotRestaurantRela selectByPrimaryKey(int key);

    int updateByPrimaryKeySelective(ScenicSpotRestaurantRela record);

    int updateByPrimaryKey(ScenicSpotRestaurantRela record);
}