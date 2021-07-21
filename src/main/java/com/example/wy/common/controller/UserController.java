package com.example.wy.common.controller;


import com.example.wy.common.utils.RespBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author FS
 * @since 2021-05-08
 */

@RestController
@RequestMapping("/wy/user")

public class UserController  {

    @GetMapping("/hello")
    @CrossOrigin(value = "http://localhost:8080", maxAge = 1800, allowedHeaders ="*")
    public RespBean test() {
        return RespBean.ok("hello");
    }
}
