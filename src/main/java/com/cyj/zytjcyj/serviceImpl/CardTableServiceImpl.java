package com.cyj.zytjcyj.serviceImpl;

import com.cyj.zytjcyj.entity.CardTable;
import com.cyj.zytjcyj.mapper.CardTableMapper;
import com.cyj.zytjcyj.service.CardTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CardTableServiceImpl implements CardTableService {
    @Autowired
    private CardTableMapper cardTableMapper;
    /***
     * 根据表名查询表数据
     * @return
     */
    @Override
    public List<CardTable> queryTable(String tableName) {
        return cardTableMapper.queryTable(tableName);
    }
    /***
     *修改进入阅览室人的状态
     * @param cardTable
     * @return
     */
    @Override
    public Integer updateStatic(CardTable cardTable) {
        return cardTableMapper.updateStatic(cardTable);
    }
}
