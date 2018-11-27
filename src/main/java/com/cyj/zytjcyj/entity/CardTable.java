package com.cyj.zytjcyj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardTable {
    /**
     * 表明
     */
    private String tableName;
    /**
     * 卡号
     */
    private String cardNo;
    /**
     * 状态
     */
    private String status;
}
