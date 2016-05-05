package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotExtend;

public interface ScenicSpotExtendMapper {
    int deleteByPrimaryKey(Integer scenicSpotExtendId);

    int insert(ScenicSpotExtend record);

    int insertSelective(ScenicSpotExtend record);

    ScenicSpotExtend selectByPrimaryKey(Integer scenicSpotExtendId);

    int updateByPrimaryKeySelective(ScenicSpotExtend record);

    int updateByPrimaryKey(ScenicSpotExtend record);
}