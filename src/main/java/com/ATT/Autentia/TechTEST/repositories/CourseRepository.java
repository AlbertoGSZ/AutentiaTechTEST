package com.ATT.Autentia.TechTEST.repositories;
import com.ATT.Autentia.TechTEST.entities.BBDDtoCourse;
import com.ATT.Autentia.TechTEST.entities.Course;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CourseRepository {


  @Insert("INSERT INTO course (name, durationHours, activatedCourse, difficultyLevel, teacherID) VALUES (#{name},#{durationHours},#{activatedCourse},#{difficultyLevel},#{teacherID})")
  @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
  void saveCourse(Course course);


  @Select("SELECT * FROM course WHERE activatedCourse=1 ORDER BY name ASC")
  @ConstructorArgs({
    @Arg(column = "id", javaType = int.class, id = true),
    @Arg(column = "name", javaType = String.class),
    @Arg(column = "durationHours", javaType = int.class),
    @Arg(column = "activatedCourse", javaType = boolean.class),
    @Arg(column = "difficultyLevel", javaType = String.class),
    @Arg(column = "teacherID", javaType = int.class)
  })
  List<BBDDtoCourse> selectActivatedCourses();
}
