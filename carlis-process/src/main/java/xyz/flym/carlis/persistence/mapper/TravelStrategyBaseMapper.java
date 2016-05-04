package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.TravelStrategyBase;

public interface TravelStrategyBaseMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(TravelStrategyBase record);

    int insertSelective(TravelStrategyBase record);

    TravelStrategyBase selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(TravelStrategyBase record);

    int updateByPrimaryKey(TravelStrategyBase record);
}