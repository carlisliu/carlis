package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.Landscape;

public interface LandscapeMapper {
    int deleteByPrimaryKey(Integer landscapeId);

    int insert(Landscape record);

    int insertSelective(Landscape record);

    Landscape selectByPrimaryKey(Integer landscapeId);

    int updateByPrimaryKeySelective(Landscape record);

    int updateByPrimaryKey(Landscape record);
}