package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.JourneyBaseInfo;

public interface JourneyBaseInfoMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(JourneyBaseInfo record);

    int insertSelective(JourneyBaseInfo record);

    JourneyBaseInfo selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(JourneyBaseInfo record);

    int updateByPrimaryKey(JourneyBaseInfo record);
}