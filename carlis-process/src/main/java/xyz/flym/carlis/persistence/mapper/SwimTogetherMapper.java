package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.SwimTogether;

public interface SwimTogetherMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(SwimTogether record);

    int insertSelective(SwimTogether record);

    SwimTogether selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(SwimTogether record);

    int updateByPrimaryKey(SwimTogether record);
}