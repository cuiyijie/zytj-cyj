package com.cyj.zytjcyj.controller;

import com.cyj.zytjcyj.entity.ConsumelogsEntity;
import com.cyj.zytjcyj.serviceImpl.ConsumelogsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/consunmelogs")
public class ConsunmelogsCrontroller {
    @Autowired
    private ConsumelogsServiceImpl consumelogsService;
    /***
     * 多条件分页查询刷卡记录表
     * @param consumelogsEntity
     * @return
     */
    @RequestMapping("/quearyAllConsumelogsFy")
   public  Object quearyAllConsumelogsFy(ConsumelogsEntity consumelogsEntity){
        consumelogsEntity.setPage((consumelogsEntity.getPage()-1)*consumelogsEntity.getRows());
        List<ConsumelogsEntity> list=consumelogsService.queryAllConsumeLogFy(consumelogsEntity);
        Integer total=consumelogsService.queryAllConsumeLogCount(consumelogsEntity);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("rows",list);
        map.put("total",total);
        return map;
   }

}
