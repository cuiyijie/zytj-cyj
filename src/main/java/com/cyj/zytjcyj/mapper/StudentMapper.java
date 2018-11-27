package com.cyj.zytjcyj.mapper;

import com.cyj.zytjcyj.entity.StudentPage;
import com.cyj.zytjcyj.entity.StudentsEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    /***
     * 查询所有学生
     * @return
     */
    List<StudentsEntity> queryAllStudent();

    /***
     * 学生的多条件查询
     * @return
     */
    List<StudentsEntity> queryStuByName(StudentPage studentPage);

    /***
     * 学生的多条件查询总条数
     * @return
     */
    int queryStuCount(StudentPage studentPage);

    /***
     * 添加一名学生
      * @param studentsEntity
     * @return
     */
    Integer addStu(StudentsEntity studentsEntity);

    /***
     * 修改学生
     * @param studentsEntity
     * @return
     */
    Integer updateStu(StudentsEntity studentsEntity);


    /***
     * 根据id删除一名学生
     * @param id
     * @return
     */
    Integer deleteStu(@Param("id") Integer id);

}
