package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotTicket;

public interface ScenicSpotTicketMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(ScenicSpotTicket record);

    int insertSelective(ScenicSpotTicket record);

    ScenicSpotTicket selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(ScenicSpotTicket record);

    int updateByPrimaryKey(ScenicSpotTicket record);
}