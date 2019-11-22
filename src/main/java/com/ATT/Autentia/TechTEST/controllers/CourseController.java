package com.ATT.Autentia.TechTEST.controllers;
import com.ATT.Autentia.TechTEST.entities.Course;
import com.ATT.Autentia.TechTEST.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;


    /** Controllers */

    @PostMapping("/course")
    private Course putCourse (@RequestBody Course course){
      courseRepository.saveCourse(course);
      return course;
    }

    @GetMapping("/course")
    Optional<List<Course>> selectAllCourses(){
        Optional<List<Course>> courseList = Optional.ofNullable(courseRepository.selectAllCourses());
        return courseList;
    }

    @GetMapping("/course/actives")
    Optional<List<Course>> selectActivatedCourses(){
      Optional<List<Course>> activatedCoursesList = Optional.ofNullable(courseRepository.selectActivatedCourses());
      return activatedCoursesList;
    }


}
