package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.UsersScenicSpotTrajectory;

public interface UsersScenicSpotTrajectoryMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(UsersScenicSpotTrajectory record);

    int insertSelective(UsersScenicSpotTrajectory record);

    UsersScenicSpotTrajectory selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(UsersScenicSpotTrajectory record);

    int updateByPrimaryKey(UsersScenicSpotTrajectory record);
}