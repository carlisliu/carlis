package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseAdminScenicSoptRela;

public interface BaseAdminScenicSoptRelaMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(BaseAdminScenicSoptRela record);

    int insertSelective(BaseAdminScenicSoptRela record);

    BaseAdminScenicSoptRela selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(BaseAdminScenicSoptRela record);

    int updateByPrimaryKey(BaseAdminScenicSoptRela record);
}