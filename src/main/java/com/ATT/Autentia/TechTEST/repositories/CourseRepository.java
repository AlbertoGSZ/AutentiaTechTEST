package com.ATT.Autentia.TechTEST.repositories;
import com.ATT.Autentia.TechTEST.entities.Course;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CourseRepository {


  @Select("SELECT * FROM course")
  @ConstructorArgs({
    @Arg(column = "id", javaType = int.class, id = true),
    @Arg(column = "name", javaType = String.class),
    @Arg(column = "durationHours", javaType = float.class),
    @Arg(column = "activatedCourse", javaType = boolean.class),
    @Arg(column = "difficultyLevel", javaType = String.class),
    @Arg(column = "teacherID", javaType = int.class)
  })
  List<Course> selectAllCourses();



  @Select("SELECT * FROM course WHERE activatedCourse=1")
  @ConstructorArgs({
    @Arg(column = "id", javaType = int.class, id = true),
    @Arg(column = "name", javaType = String.class),
    @Arg(column = "durationHours", javaType = float.class),
    @Arg(column = "activatedCourse", javaType = boolean.class),
    @Arg(column = "difficultyLevel", javaType = String.class),
    @Arg(column = "teacherID", javaType = int.class)
  })
  List<Course> selectActivatedCourses();



  @Insert("INSERT INTO course (name, durationHours, activatedCourse, difficultyLevel, teacherID) VALUES (#{name},#{durationHours},#{activatedCourse},#{difficultyLevel},#{teacherID})")
  @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
  void saveCourse(Course course);




}
