package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotFeedback;

public interface ScenicSpotFeedbackMapper {
    int deleteByPrimaryKey(Integer scenicSpotFeedbackId);

    int insert(ScenicSpotFeedback record);

    int insertSelective(ScenicSpotFeedback record);

    ScenicSpotFeedback selectByPrimaryKey(Integer scenicSpotFeedbackId);

    int updateByPrimaryKeySelective(ScenicSpotFeedback record);

    int updateByPrimaryKey(ScenicSpotFeedback record);
}