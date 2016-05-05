package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.TrafficExtend;

public interface TrafficExtendMapper {
    int insert(TrafficExtend record);

    int insertSelective(TrafficExtend record);
}