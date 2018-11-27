package com.cyj.zytjcyj.service;

import com.cyj.zytjcyj.entity.CardTable;

import java.util.List;

public interface CardTableService {
    /***
     * 根据表名查询表数据
     * @return
     */
    List<CardTable> queryTable(String tableName);
    /***
     *修改进入阅览室人的状态
     * @param cardTable
     * @return
     */
    Integer updateStatic(CardTable cardTable);
}
