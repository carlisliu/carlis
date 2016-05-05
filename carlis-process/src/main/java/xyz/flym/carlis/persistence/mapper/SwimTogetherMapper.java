package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.SwimTogether;

public interface SwimTogetherMapper {
    int insert(SwimTogether record);

    int insertSelective(SwimTogether record);
}