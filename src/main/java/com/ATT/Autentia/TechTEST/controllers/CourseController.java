package com.ATT.Autentia.TechTEST.controllers;
import com.ATT.Autentia.TechTEST.entities.BBDDtoCourse;
import com.ATT.Autentia.TechTEST.entities.Course;
import com.ATT.Autentia.TechTEST.entities.CourseAPItoCourse;
import com.ATT.Autentia.TechTEST.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;


    /** Controllers */

    @PostMapping("/course")
    private Course postCourse (@RequestBody CourseAPItoCourse courseAPItoCourse){
      Course aux = new Course(courseAPItoCourse.getName(),courseAPItoCourse.getDurationHours(),courseAPItoCourse.getActivatedCourse(),courseAPItoCourse.getDifficultyLevel(),courseAPItoCourse.getTeacherID());
      courseRepository.saveCourse(aux);
      return aux;
    }


    @GetMapping("/course")
    Optional<List<BBDDtoCourse>> selectActivatedCourses(){
         Optional<List<BBDDtoCourse>> activatedBBDDtoCoursesList = Optional.ofNullable(courseRepository.selectActivatedCourses());
         activatedBBDDtoCoursesList.get().forEach(BBDDtoCourse::toCourse);
      return activatedBBDDtoCoursesList;
    }

}
