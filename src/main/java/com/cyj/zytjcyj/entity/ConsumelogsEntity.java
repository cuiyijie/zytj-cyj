package com.cyj.zytjcyj.entity;

import com.cyj.zytjcyj.util.PoiHandler;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsumelogsEntity extends Page{
    @PoiHandler(excelHeader = "ID",excelIgnore = true)
    private int id;
    @PoiHandler(excelHeader = "卡号")
    private Integer cardNo;
    @PoiHandler(excelHeader = "阅览室ID")
    private Integer readRoomId;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @PoiHandler(excelHeader = "进入时间")
    private Date inTime;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @PoiHandler(excelHeader = "离开时间")
    private Date outTime;
    @PoiHandler(excelHeader = "状态")
    private Integer status;


}
