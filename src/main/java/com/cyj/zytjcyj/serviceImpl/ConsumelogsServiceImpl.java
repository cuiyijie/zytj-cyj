package com.cyj.zytjcyj.serviceImpl;

import com.cyj.zytjcyj.entity.ConsumelogsEntity;
import com.cyj.zytjcyj.mapper.CardTableMapper;
import com.cyj.zytjcyj.mapper.ConsumelogsMapper;
import com.cyj.zytjcyj.service.ConsumelogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumelogsServiceImpl implements ConsumelogService {
    @Autowired
    private ConsumelogsMapper consumelogsMapper;

    /***
     * 插入一条刷卡记录
     * @param consumelogsEntity
     * @return
     */
    @Override
    public Integer addConsumeLogs(ConsumelogsEntity consumelogsEntity) {
        return consumelogsMapper.addConsumeLogs(consumelogsEntity);
    }

    /***
     * 修改刷卡记录
     * @param consumelogsEntity
     * @return
     */
    @Override
    public Integer updateConsumeLogs(ConsumelogsEntity consumelogsEntity) {
        return consumelogsMapper.updateConsumeLogs(consumelogsEntity);
    }

    /***
     * 多条件分页查询刷卡记录表
     * @param consumelogsEntity
     * @return
     */
    @Override
    public List<ConsumelogsEntity> queryAllConsumeLogFy(ConsumelogsEntity consumelogsEntity) {
        return consumelogsMapper.queryAllConsumeLogFy(consumelogsEntity);
    }

    /***
     * 多条件分页查询刷卡记录表的总条数
     * @param consumelogsEntity
     * @return
     */

    @Override
    public Integer queryAllConsumeLogCount(ConsumelogsEntity consumelogsEntity) {
        return consumelogsMapper.queryAllConsumeLogCount(consumelogsEntity);
    }
    /***
     * 查询所有刷卡记录
     * @return
     */
    @Override
    public List<ConsumelogsEntity> queryAllConlog() {
        return consumelogsMapper.queryAllConlog();
    }
}
