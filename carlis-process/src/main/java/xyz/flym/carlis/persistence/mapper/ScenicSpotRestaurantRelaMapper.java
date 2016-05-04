package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotRestaurantRela;

public interface ScenicSpotRestaurantRelaMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(ScenicSpotRestaurantRela record);

    int insertSelective(ScenicSpotRestaurantRela record);

    ScenicSpotRestaurantRela selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(ScenicSpotRestaurantRela record);

    int updateByPrimaryKey(ScenicSpotRestaurantRela record);
}