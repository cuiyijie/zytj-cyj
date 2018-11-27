package com.cyj.zytjcyj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cyj.zytjcyj.mapper")
public class ZytjCyjApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZytjCyjApplication.class, args);
    }
}
