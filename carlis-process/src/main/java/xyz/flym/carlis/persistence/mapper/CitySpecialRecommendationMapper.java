package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.CitySpecialRecommendation;

public interface CitySpecialRecommendationMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(CitySpecialRecommendation record);

    int insertSelective(CitySpecialRecommendation record);

    CitySpecialRecommendation selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(CitySpecialRecommendation record);

    int updateByPrimaryKey(CitySpecialRecommendation record);
}