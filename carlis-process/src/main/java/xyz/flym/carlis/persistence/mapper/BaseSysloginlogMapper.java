package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.BaseSysloginlog;

public interface BaseSysloginlogMapper {
    int insert(BaseSysloginlog record);

    int insertSelective(BaseSysloginlog record);
}