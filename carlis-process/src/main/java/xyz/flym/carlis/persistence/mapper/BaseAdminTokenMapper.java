package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseAdminToken;

public interface BaseAdminTokenMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(BaseAdminToken record);

    int insertSelective(BaseAdminToken record);

    BaseAdminToken selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(BaseAdminToken record);

    int updateByPrimaryKey(BaseAdminToken record);
}