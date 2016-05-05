package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.CityExtend;

public interface CityExtendMapper {
    int deleteByPrimaryKey(Integer cityExtendId);

    int insert(CityExtend record);

    int insertSelective(CityExtend record);

    CityExtend selectByPrimaryKey(Integer cityExtendId);

    int updateByPrimaryKeySelective(CityExtend record);

    int updateByPrimaryKey(CityExtend record);
}