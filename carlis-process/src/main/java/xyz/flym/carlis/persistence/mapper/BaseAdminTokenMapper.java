package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseAdminToken;

public interface BaseAdminTokenMapper {
    int deleteByPrimaryKey(String userid);

    int insert(BaseAdminToken record);

    int insertSelective(BaseAdminToken record);

    BaseAdminToken selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(BaseAdminToken record);

    int updateByPrimaryKey(BaseAdminToken record);
}