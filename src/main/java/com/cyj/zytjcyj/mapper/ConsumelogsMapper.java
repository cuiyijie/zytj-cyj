package com.cyj.zytjcyj.mapper;

import com.cyj.zytjcyj.entity.ConsumelogsEntity;

import java.util.List;

public interface ConsumelogsMapper {
    /***
     * 插入一条刷卡记录
     * @param consumelogsEntity
     * @return
     */
    Integer addConsumeLogs(ConsumelogsEntity consumelogsEntity);

    /***
     * 修改刷卡记录
     * @param consumelogsEntity
     * @return
     */
    Integer updateConsumeLogs(ConsumelogsEntity consumelogsEntity);

    /***
     * 多条件分页查询刷卡记录表
     * @param consumelogsEntity
     * @return
     */
    List<ConsumelogsEntity> queryAllConsumeLogFy(ConsumelogsEntity consumelogsEntity);

    /***
     * 多条件分页查询刷卡记录表的总条数
     * @param consumelogsEntity
     * @return
     */
    Integer queryAllConsumeLogCount(ConsumelogsEntity consumelogsEntity);

    /***
     * 查询所有刷卡记录
     * @return
     */
    List<ConsumelogsEntity> queryAllConlog();
}
