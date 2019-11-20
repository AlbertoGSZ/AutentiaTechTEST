package com.ATT.Autentia.TechTEST.repositories;
import com.ATT.Autentia.TechTEST.entities.Course;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository {

  @Results({
    @Result(property = "id", column = "id"),
    @Result(property = "name", column = "name"),
    @Result(property = "durationHours", column = "durationHours"),
    @Result(property = "difficultyLevel", column = "difficultyLevel"),
    @Result(property = "activatedCourse", column = "activatedCourse"),
    @Result(property = "teacherID", column = "teacherID")
  })

    @Select("SELECT * FROM course WHERE id = #{id}")
    Course selectCourse(@Param("id") int id);

    @Select("SELECT * FROM course")
    List<Course> selectAllCourses();

    @Select("SELECT * FROM course WHERE activatedCourse = 1")
    List<Course> selectActivatedCourses();

    @Insert("INSERT INTO course (name, durationHours,difficultyLevel,activatedCourse,teacherID) VALUES (#{name},#{durationHours},#{difficultyLevel},#{activatedCourse},#{teacher.id})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void saveCourse(Course course);

}
