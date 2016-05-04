package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.County;

public interface CountyMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(County record);

    int insertSelective(County record);

    County selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(County record);

    int updateByPrimaryKey(County record);
}