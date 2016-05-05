package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.UsersInfo;

public interface UsersInfoMapper {
    int insert(UsersInfo record);

    int insertSelective(UsersInfo record);
}