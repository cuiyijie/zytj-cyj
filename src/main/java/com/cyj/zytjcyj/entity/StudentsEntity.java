package com.cyj.zytjcyj.entity;

import com.cyj.zytjcyj.util.PoiHandler;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentsEntity {
    @PoiHandler(excelHeader = "卡号",excelIgnore = true)
    private int id;
    @PoiHandler(excelHeader = "卡号")
    private String cardNo;
    @PoiHandler(excelHeader = "姓名")
    private String name;
    @PoiHandler(excelHeader = "性别")
    private String sex;
    @PoiHandler(excelHeader = "专业ID")
    private String membershipId;
    @PoiHandler(excelHeader = "状态",excelIgnore = true)
    private String status;
    @PoiHandler(excelHeader = "备注",excelIgnore = true)
    private String remark;
    @PoiHandler(excelHeader = "学号")
    private Integer stuNo;


}
