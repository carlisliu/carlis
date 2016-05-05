package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.Entertainment;

public interface EntertainmentMapper {
    int deleteByPrimaryKey(Integer entertainmentId);

    int insert(Entertainment record);

    int insertSelective(Entertainment record);

    Entertainment selectByPrimaryKey(Integer entertainmentId);

    int updateByPrimaryKeySelective(Entertainment record);

    int updateByPrimaryKey(Entertainment record);
}