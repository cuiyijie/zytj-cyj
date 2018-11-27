package com.cyj.zytjcyj.mapper;

import com.cyj.zytjcyj.entity.TeacherssEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeachersMapper {
    /***
     * 查询所有教师
     * @return
     */
    List<TeacherssEntity> queryAllTeacher();
    /**
     * 带条件的分页查询老师
     * @param teacherssEntity
     * @return
     */
    List<TeacherssEntity> querAllTeacherFy(TeacherssEntity teacherssEntity);

    /***
     * 分页查询总条数
     * @param teacherssEntity
     * @return
     */
    Integer queryAllTeachCount(TeacherssEntity teacherssEntity);
    /**
     * 添加一位老师
     * @param teacherssEntity
     * @return
     */
    Integer addTeacher(TeacherssEntity teacherssEntity);

    /**
     * 修改一位老师
     * @param teacherssEntity
     * @return
     */
    Integer updateTeacher(TeacherssEntity teacherssEntity);

    /***
     * 根据id删除一位老师
     * @param id
     * @return
     */
    Integer deleteTeacher(@Param("id") Integer id);
}
