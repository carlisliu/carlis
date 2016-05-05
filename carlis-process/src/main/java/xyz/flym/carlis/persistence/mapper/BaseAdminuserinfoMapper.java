package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseAdminuserinfo;

public interface BaseAdminuserinfoMapper {
    int deleteByPrimaryKey(String userId);

    int insert(BaseAdminuserinfo record);

    int insertSelective(BaseAdminuserinfo record);

    BaseAdminuserinfo selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(BaseAdminuserinfo record);

    int updateByPrimaryKey(BaseAdminuserinfo record);
}