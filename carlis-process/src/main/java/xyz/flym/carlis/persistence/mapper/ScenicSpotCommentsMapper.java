package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotComments;

public interface ScenicSpotCommentsMapper extends BaseMapper<ScenicSpotComments, Integer> {

    int insertSelective(ScenicSpotComments record);

    int updateByPrimaryKeySelective(ScenicSpotComments record);

}