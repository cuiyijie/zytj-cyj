package com.cyj.zytjcyj.serviceImpl;

import com.cyj.zytjcyj.entity.StatisticsEntity;
import com.cyj.zytjcyj.mapper.StatisticsMapper;
import com.cyj.zytjcyj.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StatisticsServiceImpl implements StatisticsService {
    @Autowired
    private StatisticsMapper statisticsMapper;
    /***
     * 查询刷卡记录每日进行统计
     * @return
     */
    @Override
    public List<StatisticsEntity> queryStaticLogs() {
        return statisticsMapper.queryStaticLogs();
    }
    /***
     * 添加日统计记录
     * @param statisticsEntity
     * @return
     */
    @Override
    public Integer addStaticlogs(StatisticsEntity statisticsEntity) {
        return statisticsMapper.addStaticlogs(statisticsEntity);
    }
    /***
     * 查询每月的阅览室的进出人数
     * @return
     */
    @Override
    public List<StatisticsEntity> queryChart(String year) {
        return statisticsMapper.queryChart(year);
    }
}
