package com.cg.sessionmicroservice.service;

import com.cg.sessionmicroservice.dto.APIResponseDto;
import com.cg.sessionmicroservice.dto.SessionDto;

import java.util.List;

public interface SessionService {
    List<SessionDto> getAllSessions();

    APIResponseDto getSessionById(Long sessionId);

    SessionDto saveSession(SessionDto sessionDto);

    SessionDto updateSession(Long sessionId, SessionDto sessionDto);

    void deleteSession(Long sessionId);
}
