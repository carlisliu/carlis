package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.City;

public interface CityMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}