package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.TravelStrategyTrip;

public interface TravelStrategyTripMapper {
    int deleteByPrimaryKey(Integer travelStrategyTripId);

    int insert(TravelStrategyTrip record);

    int insertSelective(TravelStrategyTrip record);

    TravelStrategyTrip selectByPrimaryKey(Integer travelStrategyTripId);

    int updateByPrimaryKeySelective(TravelStrategyTrip record);

    int updateByPrimaryKey(TravelStrategyTrip record);
}