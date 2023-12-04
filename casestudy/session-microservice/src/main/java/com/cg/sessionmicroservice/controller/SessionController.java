package com.cg.sessionmicroservice.controller;

import com.cg.sessionmicroservice.dto.APIResponseDto;
import com.cg.sessionmicroservice.dto.SessionDto;
import com.cg.sessionmicroservice.service.SessionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/sessions")
@AllArgsConstructor
@Tag(
        name = "Session_Controller",
        description = "Session_controller Exposes REST API"
)
public class SessionController {
    private SessionService sessionService;
    @Operation(
            summary = "Create Session REST API",
            description = "Create Session REST API is used to save session details in a database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    // build create Session REST API
    @PostMapping
    public ResponseEntity<SessionDto> createSession(@Valid @RequestBody SessionDto session) {
        SessionDto savedSession = sessionService.saveSession(session);
        return new ResponseEntity<>(savedSession, HttpStatus.CREATED);
    }
    @Operation(
            summary = "Get all Sessions REST API",
            description = "Get is used to get all Sessions"
    )
    @ApiResponse(
            responseCode = "20",
            description = "OK"
    )
    @GetMapping
    public ResponseEntity<List<SessionDto>> getAllSessions() {
        List<SessionDto> sessions = sessionService.getAllSessions();
        return new ResponseEntity<>(sessions, HttpStatus.OK);
    }
    @Operation(
            summary = "Get Session REST API",
            description = "Get is used to get Session"
    )
    @ApiResponse(
            responseCode = "20",
            description = "OK"
    )
    // Build Get Session by Code REST API
    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getBySessionId(@PathVariable("id") Long sessionId){
        APIResponseDto apiResponseDto = sessionService.getSessionById(sessionId);
        return ResponseEntity.ok(apiResponseDto);
    }
    @Operation(
            summary = "Update Session REST API",
            description = "Update Session REST API is used to update a particular session details in the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    // Build Update Session REST API
    @PutMapping("/{sessionId}")
    public ResponseEntity<SessionDto> updateSession(@PathVariable Long sessionId, @RequestBody SessionDto sessionDto) {
        SessionDto updatedSession = sessionService.updateSession(sessionId, sessionDto);
        return new ResponseEntity<>(updatedSession, HttpStatus.OK);
    }
    @Operation(
            summary = "Delete Session REST API",
            description = "Delete Session REST API is used to delete a particular Session from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    // Build Delete Session REST API
    @DeleteMapping("/{sessionId}")
    public ResponseEntity<String> deleteSession(@PathVariable Long sessionId) {
        sessionService.deleteSession(sessionId);
        return new ResponseEntity<>("Session successfully deleted!", HttpStatus.OK);
    }
}
