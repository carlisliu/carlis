package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.SpecialRecommendation;

public interface SpecialRecommendationMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(SpecialRecommendation record);

    int insertSelective(SpecialRecommendation record);

    SpecialRecommendation selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(SpecialRecommendation record);

    int updateByPrimaryKey(SpecialRecommendation record);
}