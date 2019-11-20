package com.ATT.Autentia.TechTEST;
import com.ATT.Autentia.TechTEST.config.AppConfig;
import com.ATT.Autentia.TechTEST.entities.Course;
import com.ATT.Autentia.TechTEST.entities.Teacher;
import com.ATT.Autentia.TechTEST.entities.enumerations.DifficultyLevel;
import com.ATT.Autentia.TechTEST.repositories.CourseRepository;
import com.ATT.Autentia.TechTEST.repositories.TeacherRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class AutentiaTechTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(AutentiaTechTestApplication.class, args);


    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    CourseRepository courseRepository = context.getBean(CourseRepository.class);
    TeacherRepository teacherRepository = context.getBean(TeacherRepository.class);


    /*Course cursoPrueba0 = new Course("Curso de prueba0", 4.0f, true, DifficultyLevel.BASIC, teacherRepository.selectTeachers().get(0));                         //Código en Main
    Course cursoPrueba1 = new Course("Curso de prueba1", 4.1f, true, DifficultyLevel.BASIC, teacherRepository.selectTeachers().get(1));                         //Código en Main
    Course cursoPrueba2 = new Course("Curso de prueba2", 4.2f, true, DifficultyLevel.BASIC, teacherRepository.selectTeachers().get(2));                         //Código en Main
    courseRepository.saveCourse(cursoPrueba0);
    courseRepository.saveCourse(cursoPrueba1);
    courseRepository.saveCourse(cursoPrueba2);*/


    //for (Course course1 : courseRepository.selectAllCourses())
     //System.out.println(course1.getId() + " " + course1.getName() + " " + course1.getDurationHours() + " " + course1.getDifficultyLevel() + " " + course1.getTeacher());

    System.out.println(courseRepository.selectCourse(4).getName());


  }
}
