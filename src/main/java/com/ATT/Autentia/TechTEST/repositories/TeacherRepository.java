package com.ATT.Autentia.TechTEST.repositories;
import com.ATT.Autentia.TechTEST.entities.Teacher;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository {




        @Select("SELECT * FROM teacher")
        List<Teacher> selectTeachers();

}
