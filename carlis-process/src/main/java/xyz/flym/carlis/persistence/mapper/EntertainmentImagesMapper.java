package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.EntertainmentImages;

public interface EntertainmentImagesMapper {
    int deleteByPrimaryKey(Integer advertisingId);

    int insert(EntertainmentImages record);

    int insertSelective(EntertainmentImages record);

    EntertainmentImages selectByPrimaryKey(Integer advertisingId);

    int updateByPrimaryKeySelective(EntertainmentImages record);

    int updateByPrimaryKey(EntertainmentImages record);
}