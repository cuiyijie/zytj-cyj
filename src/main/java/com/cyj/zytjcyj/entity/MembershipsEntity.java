package com.cyj.zytjcyj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MembershipsEntity {
    private int id;
    private String department;
    private String specialty;
    private String degree;

}
