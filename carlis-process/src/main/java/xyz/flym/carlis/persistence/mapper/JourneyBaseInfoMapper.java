package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.JourneyBaseInfo;

public interface JourneyBaseInfoMapper {
    int deleteByPrimaryKey(Long journeyBaseInfoId);

    int insert(JourneyBaseInfo record);

    int insertSelective(JourneyBaseInfo record);

    JourneyBaseInfo selectByPrimaryKey(Long journeyBaseInfoId);

    int updateByPrimaryKeySelective(JourneyBaseInfo record);

    int updateByPrimaryKey(JourneyBaseInfo record);
}