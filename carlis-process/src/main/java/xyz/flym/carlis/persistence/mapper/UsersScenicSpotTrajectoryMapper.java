package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.UsersScenicSpotTrajectory;

public interface UsersScenicSpotTrajectoryMapper {
    int deleteByPrimaryKey(Integer usersScenicSpotTrajectoryId);

    int insert(UsersScenicSpotTrajectory record);

    int insertSelective(UsersScenicSpotTrajectory record);

    UsersScenicSpotTrajectory selectByPrimaryKey(Integer usersScenicSpotTrajectoryId);

    int updateByPrimaryKeySelective(UsersScenicSpotTrajectory record);

    int updateByPrimaryKey(UsersScenicSpotTrajectory record);
}