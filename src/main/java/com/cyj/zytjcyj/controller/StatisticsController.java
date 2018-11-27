package com.cyj.zytjcyj.controller;

import com.cyj.zytjcyj.entity.StatisticsEntity;
import com.cyj.zytjcyj.serviceImpl.StatisticsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
@RestController
@RequestMapping("/statictis")
public class StatisticsController {
    @Autowired
    private StatisticsServiceImpl statisticsService;
    /***
     * 查询每月的阅览室的进出人数图表
     * @return
     */
    @RequestMapping("/staticChart")
    public  Object staticChart(){
        List<Map<String,Object>> data =new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        List<StatisticsEntity> list=statisticsService.queryChart(year+"");
        if (list.size()>0){
            for (int i = 0; i <list.size() ; i++) {
                Map<String,Object> map=new HashMap<>();
                map.put("name",list.get(i).getMonth());
                map.put("value",list.get(i).getPeopleNums());
                data.add(map);
            }
        }
        return data;
    }
}
