package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseSysmenu;

public interface BaseSysmenuMapper {
    int deleteByPrimaryKey(String menuId);

    int insert(BaseSysmenu record);

    int insertSelective(BaseSysmenu record);

    BaseSysmenu selectByPrimaryKey(String menuId);

    int updateByPrimaryKeySelective(BaseSysmenu record);

    int updateByPrimaryKey(BaseSysmenu record);
}