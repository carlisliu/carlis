package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.CityExtend;

public interface CityExtendMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(CityExtend record);

    int insertSelective(CityExtend record);

    CityExtend selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(CityExtend record);

    int updateByPrimaryKey(CityExtend record);
}