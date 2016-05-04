package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.SearchIndex;

public interface SearchIndexMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(SearchIndex record);

    int insertSelective(SearchIndex record);

    SearchIndex selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(SearchIndex record);

    int updateByPrimaryKey(SearchIndex record);
}