package com.ATT.Autentia.TechTEST.controllers;
import com.ATT.Autentia.TechTEST.entities.Teacher;
import com.ATT.Autentia.TechTEST.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;


    /** Controllers */

    @GetMapping("/teacher")
    public Optional<List<Teacher>> getTeachers (){
        Optional<List<Teacher>> teachersList = Optional.ofNullable(teacherRepository.selectTeachers());
        return teachersList;
    }

}
