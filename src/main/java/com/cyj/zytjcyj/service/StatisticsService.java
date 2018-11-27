package com.cyj.zytjcyj.service;

import com.cyj.zytjcyj.entity.StatisticsEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StatisticsService {
    /***
     * 查询刷卡记录每日进行统计
     * @return
     */
    List<StatisticsEntity> queryStaticLogs();
    /***
     * 添加日统计记录
     * @param statisticsEntity
     * @return
     */
    Integer addStaticlogs(StatisticsEntity statisticsEntity);
    /***
     * 查询每月的阅览室的进出人数
     * @return
     */
    List<StatisticsEntity> queryChart(@Param("year") String year);
}
