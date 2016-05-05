package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.County;

public interface CountyMapper {
    int deleteByPrimaryKey(Integer countyId);

    int insert(County record);

    int insertSelective(County record);

    County selectByPrimaryKey(Integer countyId);

    int updateByPrimaryKeySelective(County record);

    int updateByPrimaryKey(County record);
}