package com.cyj.zytjcyj.util;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@Accessors(chain = true)
public class Result {
    private boolean success;
    private Object message;
    private String remark;
    

	
    
	
}
