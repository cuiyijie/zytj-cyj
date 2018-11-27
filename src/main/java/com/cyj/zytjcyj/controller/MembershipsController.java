package com.cyj.zytjcyj.controller;

import com.cyj.zytjcyj.entity.MembershipsEntity;
import com.cyj.zytjcyj.service.MembershipsService;
import com.cyj.zytjcyj.serviceImpl.MembershipsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mem")
public class MembershipsController {
    @Autowired
    private MembershipsServiceImpl membershipsService;
    /***
     * 查询所有院系
     * @return
     */
    @RequestMapping("/queryAllMemberships")
    public Object queryAllMemberships(){
        List<MembershipsEntity> list=membershipsService.queryaAllMemberships();
        return list;
    }
}
