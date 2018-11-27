package com.cyj.zytjcyj.serviceImpl;


import com.cyj.zytjcyj.entity.StudentPage;
import com.cyj.zytjcyj.entity.StudentsEntity;
import com.cyj.zytjcyj.mapper.StudentMapper;
import com.cyj.zytjcyj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    /***
     * 查询所有学生
     * @return
     */
    @Override
    public List<StudentsEntity> queryAllStudent() {
        return studentMapper.queryAllStudent();
    }

    /***
     * 学生的多条件查询
     * @return
     */
    @Override
    public List<StudentsEntity> queryStuByName(StudentPage studentPage) {
        return studentMapper.queryStuByName(studentPage);
    }

    /***
     * 学生的多条件查询总条数
     * @return
     */
    @Override
    public int queryStuCount(StudentPage studentPage) {
        return studentMapper.queryStuCount(studentPage);
    }

    /***
     * 添加一名学生
     * @param studentsEntity
     * @return
     */
    @Override
    public Integer addStu(StudentsEntity studentsEntity) {
        return studentMapper.addStu(studentsEntity);
    }

    /***
     * 修改学生
     * @param studentsEntity
     * @return
     */
    @Override
    public Integer updateStu(StudentsEntity studentsEntity) {
        return studentMapper.updateStu(studentsEntity);
    }

    /***
     * 根据id删除一名学生
     * @param id
     * @return
     */
    @Override
    public Integer deleteStu(Integer id) {
        return studentMapper.deleteStu(id);
    }
}
