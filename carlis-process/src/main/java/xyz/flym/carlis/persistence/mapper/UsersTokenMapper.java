package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.UsersToken;

public interface UsersTokenMapper {
    int deleteByPrimaryKey(Integer userTokenId);

    int insert(UsersToken record);

    int insertSelective(UsersToken record);

    UsersToken selectByPrimaryKey(Integer userTokenId);

    int updateByPrimaryKeySelective(UsersToken record);

    int updateByPrimaryKey(UsersToken record);
}