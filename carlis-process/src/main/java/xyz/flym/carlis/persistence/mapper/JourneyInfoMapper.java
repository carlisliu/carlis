package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.JourneyInfo;

public interface JourneyInfoMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(JourneyInfo record);

    int insertSelective(JourneyInfo record);

    JourneyInfo selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(JourneyInfo record);

    int updateByPrimaryKey(JourneyInfo record);
}