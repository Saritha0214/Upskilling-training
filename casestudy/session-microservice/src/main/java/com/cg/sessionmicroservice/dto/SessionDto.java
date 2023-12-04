package com.cg.sessionmicroservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(
        description = "Session_Dto Model info"
)
public class SessionDto {

    private Long sessionId;
//    @Schema(
//            description = "Course Code"
//    )
//    private String courseCode;
//    @Schema(
//            description = "Mentor Id"
//    )
//    private Long mentorId;
    @Schema(
            description = "Session Date"
    )
    private LocalDate sessionDate;
    @Schema(
            description = "Hours Spent"
    )
    private float hoursSpent;
    @Schema(
            description = "Participants"
    )
    private Long participants;
}
