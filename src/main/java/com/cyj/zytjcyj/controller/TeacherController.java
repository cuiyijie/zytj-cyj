package com.cyj.zytjcyj.controller;

import com.cyj.zytjcyj.entity.TeacherssEntity;
import com.cyj.zytjcyj.serviceImpl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/techer")
public class TeacherController {
    @Autowired
    private TeacherServiceImpl teacherService;

    /***
     * 带条件的分页查询老师
     * @param teacherssEntity
     * @return
     */
    @RequestMapping("/queryTeacherFy")
    public Object queryTeacherFy(TeacherssEntity teacherssEntity) {
        teacherssEntity.setPage((teacherssEntity.getPage() - 1) * teacherssEntity.getRows());
        List<TeacherssEntity> list = teacherService.querAllTeacherFy(teacherssEntity);
        Integer total = teacherService.queryAllTeachCount(teacherssEntity);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rows", list);
        map.put("total", total);
        return map;
    }

    /***
     * 添加教师
     * @param teacherssEntity
     * @return
     */
    @RequestMapping("/addTeacher")
    public Object addTeacher(TeacherssEntity teacherssEntity) {
        int a = teacherService.addTeacher(teacherssEntity);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("addInfo", a);
        return map;
    }

    /***
     * 修改教师
     * @param teacherssEntity
     * @return
     */
    @RequestMapping("/updateTeacher")
    public Object updateTeacher(TeacherssEntity teacherssEntity) {
        int a = teacherService.updateTeacher(teacherssEntity);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("res", a);
        return map;
    }

    /***
     * 删除教师
     * @param id
     * @return
     */
    @RequestMapping("/deleteTeacher")
    public Object deleteTeacher(Integer id) {
        int a = teacherService.deleteTeacher(id);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("res", a);
        return map;
    }
}
