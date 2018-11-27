package com.cyj.zytjcyj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentPage {
    private int id;
    private String cardNo;
    private String name;
    private String sex;
    private String membershipId;
    private String status;
    private String remark;
    private Integer stuNo;
    private Integer page;//当前第几页
    private Integer rows;
    protected Integer startIndex;//默认显示第1-30条数据
}
