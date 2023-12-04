package com.cg.coursemicroservice.mapper;

import com.cg.coursemicroservice.dto.CourseDto;
import com.cg.coursemicroservice.entity.Course;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-04T12:10:21+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Amazon.com Inc.)"
)
public class AutoCourseMapperImpl implements AutoCourseMapper {

    @Override
    public CourseDto mapToCourseDto(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseDto courseDto = new CourseDto();

        courseDto.setCourseId( course.getCourseId() );
        courseDto.setCourseName( course.getCourseName() );
        courseDto.setCourseCode( course.getCourseCode() );
        courseDto.setStartDate( course.getStartDate() );
        courseDto.setEndDate( course.getEndDate() );
        courseDto.setAssignedMentor( course.getAssignedMentor() );
        courseDto.setTotalHours( course.getTotalHours() );

        return courseDto;
    }

    @Override
    public Course mapToCourse(CourseDto courseDto) {
        if ( courseDto == null ) {
            return null;
        }

        Course course = new Course();

        course.setCourseId( courseDto.getCourseId() );
        course.setCourseName( courseDto.getCourseName() );
        course.setCourseCode( courseDto.getCourseCode() );
        course.setStartDate( courseDto.getStartDate() );
        course.setEndDate( courseDto.getEndDate() );
        course.setAssignedMentor( courseDto.getAssignedMentor() );
        course.setTotalHours( courseDto.getTotalHours() );

        return course;
    }
}
