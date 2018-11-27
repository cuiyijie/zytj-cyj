package com.cyj.zytjcyj.controller;

import com.cyj.zytjcyj.entity.StudentPage;
import com.cyj.zytjcyj.entity.StudentsEntity;
import com.cyj.zytjcyj.serviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;
    /***
     * 查询所有学生
     * @return
     */
    @RequestMapping("/queryAllstudent")
    public  Object queryAllstudent(){
        return studentService.queryAllStudent();
    }
    /***
     * 学生的多条件分页查询
     * @return
     */
    @RequestMapping("/queryStuFy")
    public  Object queryAllStuFy(StudentPage studentPage){
        studentPage.setPage((studentPage.getPage()-1)*studentPage.getRows());
        List<StudentsEntity> list=studentService.queryStuByName(studentPage);
        int total=studentService.queryStuCount(studentPage);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("rows",list);
        map.put("total",total);
        return  map;
    }

    /***
     * 添加学生
     * @param studentsEntity
     * @return
     */
    @RequestMapping("/addStudent")
    public  Object addStudent(StudentsEntity studentsEntity){
         int a=studentService.addStu(studentsEntity);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("addInfo", a);
       return map;
    }

    /***
     * 修改学生
     * @param studentsEntity
     * @return
     */
    @RequestMapping("/updateStudent")
    public Object updateStudent(StudentsEntity studentsEntity){
        int a=studentService.updateStu(studentsEntity);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("addInfo", a);
        return map;
    }

    /***
     * 删除学生
     * @param id
     * @return
     */
    @RequestMapping("/deleteStudent")
    public  Object deleteStudent(Integer id){
     int a=studentService.deleteStu(id);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("addInfo", a);
        return map;
    }




}
