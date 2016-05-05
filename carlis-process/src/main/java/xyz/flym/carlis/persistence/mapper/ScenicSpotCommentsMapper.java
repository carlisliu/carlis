package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotComments;

public interface ScenicSpotCommentsMapper {
    int deleteByPrimaryKey(Integer scenicSpotCommentsId);

    int insert(ScenicSpotComments record);

    int insertSelective(ScenicSpotComments record);

    ScenicSpotComments selectByPrimaryKey(Integer scenicSpotCommentsId);

    int updateByPrimaryKeySelective(ScenicSpotComments record);

    int updateByPrimaryKey(ScenicSpotComments record);
}