package com.cyj.zytjcyj.mapper;

import com.cyj.zytjcyj.entity.CardTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CardTableMapper {
    /***
     * 根据表名查询表数据
     * @return
     */
    List<CardTable> queryTable( @Param("tableName") String tableName);

    /***
     *修改进入阅览室人的状态
     * @param cardTable
     * @return
     */
    Integer updateStatic(CardTable cardTable);

}
