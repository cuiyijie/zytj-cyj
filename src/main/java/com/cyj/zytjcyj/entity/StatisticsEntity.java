package com.cyj.zytjcyj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatisticsEntity {
    private int id;
    private int readRoomId;
    private Integer peopleNums;
    private String year;
    private String month;
    private String day;


}
