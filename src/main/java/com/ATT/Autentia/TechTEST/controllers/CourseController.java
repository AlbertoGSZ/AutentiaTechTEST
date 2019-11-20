package com.ATT.Autentia.TechTEST.controllers;
import com.ATT.Autentia.TechTEST.entities.Course;
import com.ATT.Autentia.TechTEST.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @PutMapping
    private void putCourse (Course course){
      courseRepository.saveCourse(course);
    }



}
