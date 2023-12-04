package com.cg.sessionmicroservice.service.impl;

import com.cg.sessionmicroservice.dto.APIResponseDto;
import com.cg.sessionmicroservice.dto.MentorDto;
import com.cg.sessionmicroservice.dto.CourseDto;

import com.cg.sessionmicroservice.dto.SessionDto;
import com.cg.sessionmicroservice.entity.Session;
import com.cg.sessionmicroservice.mapper.AutoSessionMapper;
import com.cg.sessionmicroservice.mapper.SessionMapper;
import com.cg.sessionmicroservice.repository.SessionRepository;
import com.cg.sessionmicroservice.service.SessionService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor
public class SessionServiceImpl implements SessionService {

    private SessionRepository sessionRepository;

//    private RestTemplate restTemplate;

    @Override
    public List<SessionDto> getAllSessions() {
        List<Session> sessions = sessionRepository.findAll();
        return sessions.stream().map((session) -> AutoSessionMapper.MAPPER.mapToSessionDto(session))
                .collect(Collectors.toList());
    }

    @Override
    public APIResponseDto getSessionById(Long sessionId) {
        Session session = sessionRepository.findById(sessionId).get();

//        ResponseEntity<MentorDto> responseEntity = restTemplate.getForEntity("http://localhost:8080/api/mentors/" + session.getMentorId(),
//                MentorDto.class);
//        MentorDto mentorDto = responseEntity.getBody();
//
//        ResponseEntity<CourseDto> responseEntity1 = restTemplate.getForEntity("http://localhost:8081/api/courses/" + session.getCourseCode(),
//                CourseDto.class);
//        CourseDto courseDto = responseEntity1.getBody();

        SessionDto sessionDto = SessionMapper.mapToSessionDto(session);

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setSession(sessionDto);
//        apiResponseDto.setMentor(mentorDto);
//        apiResponseDto.setCourse(courseDto);

        return apiResponseDto;

    }

    @Override
    public SessionDto saveSession(SessionDto sessionDto) {
        Session session = AutoSessionMapper.MAPPER.mapToSession(sessionDto);

        Session savedSession = sessionRepository.save(session);

        SessionDto savedSessionDto = AutoSessionMapper.MAPPER.mapToSessionDto(savedSession);

        return savedSessionDto;
    }

    @Override
    public SessionDto updateSession(Long sessionId, SessionDto sessionDto) {
        Optional<Session> optionalSession = sessionRepository.findById(sessionId);
        if (optionalSession.isPresent()) {
            Session existingSession = optionalSession.get();
            // Update the fields as needed
            existingSession.setSessionDate(sessionDto.getSessionDate());
            existingSession.setHoursSpent(sessionDto.getHoursSpent());
            existingSession.setParticipants(sessionDto.getParticipants());
            Session updatedSession = sessionRepository.save(existingSession);
            return AutoSessionMapper.MAPPER.mapToSessionDto(updatedSession);
        } else {
            throw new EntityNotFoundException("Session with ID " + sessionId + " not found");
        }
    }

    @Override
    public void deleteSession(Long sessionId) {
        if (sessionRepository.existsById(sessionId)) {
            sessionRepository.deleteById(sessionId);
        } else {
            throw new EntityNotFoundException("Session with ID " + sessionId + " not found");
        }
    }
}
