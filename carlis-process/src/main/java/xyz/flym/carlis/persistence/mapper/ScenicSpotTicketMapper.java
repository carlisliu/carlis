package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.ScenicSpotTicket;

public interface ScenicSpotTicketMapper {
    int insert(ScenicSpotTicket record);

    int insertSelective(ScenicSpotTicket record);
}