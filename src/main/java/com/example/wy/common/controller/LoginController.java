package com.example.wy.common.controller;

import com.example.wy.common.common.GenericResponse;
import com.example.wy.common.entity.User;
import com.example.wy.common.mapper.UserMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class LoginController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping(value = "/dologin/{phone}" ,  produces = MediaType.APPLICATION_JSON_UTF8_VALUE,method = RequestMethod.GET)
    public GenericResponse loginSelecte(@PathVariable("phone") String phone){
        GenericResponse response = new GenericResponse();
        List<User> list=new ArrayList<User>();
//      User user=userMapper.loadUserByUsername(phone);
        list=userMapper.selectAllByPhone(phone);
        if(list.size()!=0){
            response.setStatus(1);
            return response;
        }
        else{
            response.setStatus(0);
            return response;
        }
    }
    @RequestMapping(value = "/userinsert" ,  produces = MediaType.APPLICATION_JSON_UTF8_VALUE,method = RequestMethod.POST)
    public GenericResponse userInsert(@RequestBody User user){
        try {
            userMapper.insert(user);
        }catch (Exception e){
            System.out.println("插入错误");
        }
        GenericResponse response = new GenericResponse<>();
        return response;
    }
    @RequestMapping(value = "/userVerify" ,  produces = MediaType.APPLICATION_JSON_UTF8_VALUE,method = RequestMethod.POST)
    public GenericResponse userSelectAndVerify(@RequestBody User user){
        GenericResponse response = new GenericResponse();
        List<User> list=new ArrayList<User>();
        list=userMapper.selectAllByPhone(user.getPhone());
        if(list.get(0).getPassword().equals(user.getPassword())){
            response.setStatus(1);
            return response;
        }else {
            response.setStatus(0);
            return response;
        }
    }

}
