package com.cyj.zytjcyj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComputersEntity {
    private int id;
    private String name;
    private String ip;
    private int readRoomId;
    private String remark;


}
