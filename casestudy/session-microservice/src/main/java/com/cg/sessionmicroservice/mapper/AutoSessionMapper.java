package com.cg.sessionmicroservice.mapper;

import com.cg.sessionmicroservice.dto.SessionDto;
import com.cg.sessionmicroservice.entity.Session;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface AutoSessionMapper {
    AutoSessionMapper MAPPER = Mappers.getMapper(AutoSessionMapper.class);

    SessionDto mapToSessionDto(Session session);

    Session mapToSession(SessionDto sessionDto);
}
