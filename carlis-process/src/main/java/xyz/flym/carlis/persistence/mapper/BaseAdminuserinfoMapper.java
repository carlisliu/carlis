package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseAdminuserinfo;

public interface BaseAdminuserinfoMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(BaseAdminuserinfo record);

    int insertSelective(BaseAdminuserinfo record);

    BaseAdminuserinfo selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(BaseAdminuserinfo record);

    int updateByPrimaryKey(BaseAdminuserinfo record);
}