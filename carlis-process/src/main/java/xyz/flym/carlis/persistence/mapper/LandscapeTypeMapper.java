package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.LandscapeType;

public interface LandscapeTypeMapper {
    int deleteByPrimaryKey(Integer landscapeTypeId);

    int insert(LandscapeType record);

    int insertSelective(LandscapeType record);

    LandscapeType selectByPrimaryKey(Integer landscapeTypeId);

    int updateByPrimaryKeySelective(LandscapeType record);

    int updateByPrimaryKey(LandscapeType record);
}