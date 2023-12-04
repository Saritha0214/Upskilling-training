package com.cg.sessionmicroservice.mapper;

import com.cg.sessionmicroservice.dto.SessionDto;
import com.cg.sessionmicroservice.entity.Session;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-04T12:12:06+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Amazon.com Inc.)"
)
public class AutoSessionMapperImpl implements AutoSessionMapper {

    @Override
    public SessionDto mapToSessionDto(Session session) {
        if ( session == null ) {
            return null;
        }

        SessionDto sessionDto = new SessionDto();

        sessionDto.setSessionId( session.getSessionId() );
        sessionDto.setSessionDate( session.getSessionDate() );
        sessionDto.setHoursSpent( session.getHoursSpent() );
        sessionDto.setParticipants( session.getParticipants() );

        return sessionDto;
    }

    @Override
    public Session mapToSession(SessionDto sessionDto) {
        if ( sessionDto == null ) {
            return null;
        }

        Session session = new Session();

        session.setSessionId( sessionDto.getSessionId() );
        session.setSessionDate( sessionDto.getSessionDate() );
        session.setHoursSpent( sessionDto.getHoursSpent() );
        session.setParticipants( sessionDto.getParticipants() );

        return session;
    }
}
