package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.JourneyInfo;

public interface JourneyInfoMapper {
    int deleteByPrimaryKey(Long journeyInfoId);

    int insert(JourneyInfo record);

    int insertSelective(JourneyInfo record);

    JourneyInfo selectByPrimaryKey(Long journeyInfoId);

    int updateByPrimaryKeySelective(JourneyInfo record);

    int updateByPrimaryKey(JourneyInfo record);
}