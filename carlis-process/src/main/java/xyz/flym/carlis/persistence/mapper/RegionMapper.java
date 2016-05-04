package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.Region;

public interface RegionMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(Region record);

    int insertSelective(Region record);

    Region selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKey(Region record);
}