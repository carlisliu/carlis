package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.SwimTogetherRoute;

public interface SwimTogetherRouteMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(SwimTogetherRoute record);

    int insertSelective(SwimTogetherRoute record);

    SwimTogetherRoute selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(SwimTogetherRoute record);

    int updateByPrimaryKey(SwimTogetherRoute record);
}