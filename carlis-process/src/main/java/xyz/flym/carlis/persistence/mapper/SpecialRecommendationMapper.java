package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.SpecialRecommendation;

public interface SpecialRecommendationMapper {
    int deleteByPrimaryKey(Integer regionId);

    int insert(SpecialRecommendation record);

    int insertSelective(SpecialRecommendation record);

    SpecialRecommendation selectByPrimaryKey(Integer regionId);

    int updateByPrimaryKeySelective(SpecialRecommendation record);

    int updateByPrimaryKey(SpecialRecommendation record);
}