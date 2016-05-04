package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseSysmenu;

public interface BaseSysmenuMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(BaseSysmenu record);

    int insertSelective(BaseSysmenu record);

    BaseSysmenu selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(BaseSysmenu record);

    int updateByPrimaryKey(BaseSysmenu record);
}