package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
 
    private final Logger log = LoggerFactory.getLogger(StudentService.class);
 
    @Autowired
    private StudentRepository studentRepository;
 
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
 
    public Optional<Student> getStudentById(String id) {
        return studentRepository.findById(id);
    }
 
    public Student createStudent(Student student) {
log.info("Creating a new student: {}", student);
        return studentRepository.save(student);
    }
 
    public Optional<Student> updateStudent(String id, Student updatedStudent) {
log.info("Updating student with ID {}: {}", id, updatedStudent);
        Optional<Student> existingStudent = studentRepository.findById(id);
        if (existingStudent.isPresent()) {
            Student updated = existingStudent.get();
            updated.setName(updatedStudent.getName());
            updated.setAge(updatedStudent.getAge());
            updated.setSalary(updatedStudent.getSalary());
            return Optional.of(studentRepository.save(updated));
        }
        return Optional.empty();
    }
 
    public void deleteStudent(String id) {
log.info("Deleting student with ID: {}", id);
        studentRepository.deleteById(id);
    }
}