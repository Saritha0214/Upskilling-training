package com.cg.coursemicroservice.service.impl;

import com.cg.coursemicroservice.dto.CourseDto;
import com.cg.coursemicroservice.entity.Course;
import com.cg.coursemicroservice.mapper.AutoCourseMapper;
import com.cg.coursemicroservice.repository.CourseRepository;
import com.cg.coursemicroservice.service.CourseService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    private CourseRepository courseRepository;

    @Override
    public CourseDto saveCourse(CourseDto courseDto) {
        Course course = AutoCourseMapper.MAPPER.mapToCourse(courseDto);
        Course savedCourse = courseRepository.save(course);
        CourseDto savedCourseDto = AutoCourseMapper.MAPPER.mapToCourseDto(savedCourse);
        return savedCourseDto;
    }

    @Override
    public CourseDto getByCourseCode(String courseCode) {
        Course course = courseRepository.getByCourseCode(courseCode);
        return AutoCourseMapper.MAPPER.mapToCourseDto(course);
    }

    @Override
    public List<CourseDto> getAllCourses() {
        List<Course> courses = courseRepository.findAll();
        return courses.stream().map((course) -> AutoCourseMapper.MAPPER.mapToCourseDto(course))
                .collect(Collectors.toList());
    }

    @Override
    public CourseDto updateCourse(String courseCode, CourseDto updatedCourseDto) {
        // Step 1: Retrieve the existing Course entity
        Course existingCourse = courseRepository.getByCourseCode(courseCode);

        if (existingCourse == null) {
            // Handle the case where the course with the provided code doesn't exist
            throw new EntityNotFoundException("Course not found with code: " + courseCode);
        }

        // Step 2: Update the properties of the existing Course entity
        existingCourse.setCourseName(updatedCourseDto.getCourseName());
        existingCourse.setCourseCode(updatedCourseDto.getCourseCode());
        existingCourse.setStartDate(updatedCourseDto.getStartDate());
        existingCourse.setEndDate(updatedCourseDto.getEndDate());
        existingCourse.setAssignedMentor(updatedCourseDto.getAssignedMentor());
        existingCourse.setTotalHours(updatedCourseDto.getTotalHours());
        // Update other properties as needed

        // Step 3: Save the updated Course entity back to the repository
        Course updatedCourse = courseRepository.save(existingCourse);

        // Step 4: Return the updated CourseDto
        return AutoCourseMapper.MAPPER.mapToCourseDto(updatedCourse);
    }

    @Override
    public void deleteCourse(String courseCode) {
        Course existingCourse = courseRepository.getByCourseCode(courseCode);

        if (existingCourse == null) {
            throw new EntityNotFoundException("Course not found with code: " + courseCode);
        }
        courseRepository.delete(existingCourse);
    }

}
