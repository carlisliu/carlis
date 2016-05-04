package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.TrafficExtend;

public interface TrafficExtendMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(TrafficExtend record);

    int insertSelective(TrafficExtend record);

    TrafficExtend selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(TrafficExtend record);

    int updateByPrimaryKey(TrafficExtend record);
}