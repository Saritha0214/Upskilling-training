package com.cg.sessionmicroservice.mapper;

import com.cg.sessionmicroservice.dto.SessionDto;
import com.cg.sessionmicroservice.entity.Session;

public class SessionMapper {
    public static SessionDto mapToSessionDto(Session session){
        SessionDto sessionDto = new SessionDto(
                session.getSessionId(),
//                session.getCourseCode(),
//                session.getMentorId(),
                session.getSessionDate(),
                session.getHoursSpent(),
                session.getParticipants()
        );
        return sessionDto;
    }

    public static Session mapToSession(SessionDto sessionDto){
        Session session = new Session(
                sessionDto.getSessionId(),
//                sessionDto.getCourseCode(),
//                sessionDto.getMentorId(),
                sessionDto.getSessionDate(),
                sessionDto.getHoursSpent(),
                sessionDto.getParticipants()
        );
        return session;
    }
}
