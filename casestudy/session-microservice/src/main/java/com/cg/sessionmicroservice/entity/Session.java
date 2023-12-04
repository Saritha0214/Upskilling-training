package com.cg.sessionmicroservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sessions")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sessionId;
//    private String courseCode;
//    private Long mentorId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate sessionDate;
    private float hoursSpent;
    private Long participants;
}
