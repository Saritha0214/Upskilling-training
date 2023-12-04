package com.cg.coursemicroservice.service;

import com.cg.coursemicroservice.dto.CourseDto;

import java.util.List;

public interface CourseService {

    CourseDto saveCourse(CourseDto courseDto);

    CourseDto getByCourseCode(String courseCode);

    List<CourseDto> getAllCourses();

    CourseDto updateCourse(String courseCode , CourseDto courseDto);

    void deleteCourse(String courseCode);


}
