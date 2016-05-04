package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseSysloginlog;

public interface BaseSysloginlogMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(BaseSysloginlog record);

    int insertSelective(BaseSysloginlog record);

    BaseSysloginlog selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(BaseSysloginlog record);

    int updateByPrimaryKey(BaseSysloginlog record);
}