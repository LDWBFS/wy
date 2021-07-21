package com.example.wy.common.controller;


import com.example.wy.common.mapper.CasebookMapper;
import com.example.wy.common.service.impl.CasebookServiceImpl;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author FS
 * @since 2021-06-03
 */
@RestController
public class CasebookController  {
    @Resource
    private CasebookMapper casebookMapper;

    @RequestMapping(value ="/new/casebook/{phone}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE,method = RequestMethod.GET)
    public boolean findCasebook(@PathVariable("phone") String phone){
        System.out.println(casebookMapper.selectAllByPhone(phone));
//        if(casebookMapper.selectAllByPhone(phone)==null) {
//            return false;
//        }
//        else {
//            return true;
//        }
        return true;
    }

}
