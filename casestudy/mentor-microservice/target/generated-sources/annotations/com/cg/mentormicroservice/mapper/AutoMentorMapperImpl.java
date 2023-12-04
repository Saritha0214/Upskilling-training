package com.cg.mentormicroservice.mapper;

import com.cg.mentormicroservice.dto.MentorDto;
import com.cg.mentormicroservice.entity.Mentor;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-04T12:11:14+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Amazon.com Inc.)"
)
public class AutoMentorMapperImpl implements AutoMentorMapper {

    @Override
    public MentorDto mapToMentorDto(Mentor mentor) {
        if ( mentor == null ) {
            return null;
        }

        MentorDto mentorDto = new MentorDto();

        mentorDto.setMentorId( mentor.getMentorId() );
        mentorDto.setMentorName( mentor.getMentorName() );
        mentorDto.setExpertise( mentor.getExpertise() );
        mentorDto.setStatus( mentor.getStatus() );

        return mentorDto;
    }

    @Override
    public Mentor mapToMentor(MentorDto mentorDto) {
        if ( mentorDto == null ) {
            return null;
        }

        Mentor mentor = new Mentor();

        mentor.setMentorId( mentorDto.getMentorId() );
        mentor.setMentorName( mentorDto.getMentorName() );
        mentor.setExpertise( mentorDto.getExpertise() );
        mentor.setStatus( mentorDto.getStatus() );

        return mentor;
    }
}
