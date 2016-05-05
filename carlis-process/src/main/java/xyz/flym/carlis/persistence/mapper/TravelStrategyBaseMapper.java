package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.TravelStrategyBase;

public interface TravelStrategyBaseMapper {
    int deleteByPrimaryKey(Integer cityTravelStrategyId);

    int insert(TravelStrategyBase record);

    int insertSelective(TravelStrategyBase record);

    TravelStrategyBase selectByPrimaryKey(Integer cityTravelStrategyId);

    int updateByPrimaryKeySelective(TravelStrategyBase record);

    int updateByPrimaryKey(TravelStrategyBase record);
}