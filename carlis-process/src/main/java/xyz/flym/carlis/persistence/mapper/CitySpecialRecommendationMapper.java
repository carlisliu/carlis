package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.CitySpecialRecommendation;

public interface CitySpecialRecommendationMapper {
    int deleteByPrimaryKey(Integer citySpecialRecommendationId);

    int insert(CitySpecialRecommendation record);

    int insertSelective(CitySpecialRecommendation record);

    CitySpecialRecommendation selectByPrimaryKey(Integer citySpecialRecommendationId);

    int updateByPrimaryKeySelective(CitySpecialRecommendation record);

    int updateByPrimaryKey(CitySpecialRecommendation record);
}