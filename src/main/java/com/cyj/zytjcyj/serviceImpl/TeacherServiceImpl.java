package com.cyj.zytjcyj.serviceImpl;

import com.cyj.zytjcyj.entity.TeacherssEntity;
import com.cyj.zytjcyj.mapper.TeachersMapper;
import com.cyj.zytjcyj.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeachersMapper teachersMapper;

    /***
     * 查询所有教师
     * @return
     */
    @Override
    public List<TeacherssEntity> queryAllTeacher() {
        return teachersMapper.queryAllTeacher();
    }

    /**
     * 带条件的分页查询老师
     *
     * @param teacherssEntity
     * @return
     */
    @Override
    public List<TeacherssEntity> querAllTeacherFy(TeacherssEntity teacherssEntity) {
        return teachersMapper.querAllTeacherFy(teacherssEntity);
    }

    /***
     * 分页查询总条数
     * @param teacherssEntity
     * @return
     */
    @Override
    public Integer queryAllTeachCount(TeacherssEntity teacherssEntity) {
        return teachersMapper.queryAllTeachCount(teacherssEntity);
    }

    /**
     * 添加一位老师
     *
     * @param teacherssEntity
     * @return
     */

    @Override
    public Integer addTeacher(TeacherssEntity teacherssEntity) {
        return teachersMapper.addTeacher(teacherssEntity);
    }
    /**
     * 修改一位老师
     * @param teacherssEntity
     * @return
     */
    @Override
    public Integer updateTeacher(TeacherssEntity teacherssEntity) {
        return teachersMapper.updateTeacher(teacherssEntity);
    }
    /***
     * 根据id删除一位老师
     * @param id
     * @return
     */
    @Override
    public Integer deleteTeacher(Integer id) {
        return teachersMapper.deleteTeacher(id);
    }
}
