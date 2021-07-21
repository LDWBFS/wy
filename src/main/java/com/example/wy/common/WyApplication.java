package com.example.wy.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.wy.common.mapper")
public class WyApplication {
    public static void main(String[] args) {
        SpringApplication.run(WyApplication.class, args);
    }

}
