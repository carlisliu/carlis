package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.Advertising;

public interface AdvertisingMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(Advertising record);

    int insertSelective(Advertising record);

    Advertising selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(Advertising record);

    int updateByPrimaryKey(Advertising record);
}