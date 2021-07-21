package com.example.wy.common.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.wy.common.common.GenericResponse;
import com.example.wy.common.common.ResponseConstants;
import com.example.wy.common.entity.Count;
import com.example.wy.common.entity.Prescription;
import com.example.wy.common.mapper.CountMapper;
import com.example.wy.common.mapper.PrescriptionMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@RestController
public class showPrescription {

    @Resource
    private PrescriptionMapper prescriptionMapper;
    @Resource
    private CountMapper countMapper;


    @RequestMapping(value = "/show/prescription",produces = MediaType.APPLICATION_JSON_UTF8_VALUE,method = RequestMethod.GET)
    public GenericResponse ajax_showPrescription(){
        GenericResponse response = new GenericResponse();
        try {
            List<Prescription> sql_results;
            sql_results = prescriptionMapper.selectList(null);
            response.setData(sql_results);
            response.setStatus(1);
        }catch (Exception e){
            System.out.println("出现错误"+e);
            response.setStatus(ResponseConstants.FAIL_CODE);
        }
        return response;
    }
    @RequestMapping(value = "/show/prescription/a/{disease}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE,method = RequestMethod.GET)
    public GenericResponse selectByDisease(@PathVariable("disease") String disease){
        GenericResponse response= new GenericResponse();
        try {
            List<Prescription> sql_results;
            sql_results = prescriptionMapper.selectAllByDisease(disease);
//            sql_results = prescriptionMapper.selectAllByDisease("%"+disease+"%");
            response.setData(sql_results);
            response.setStatus(1);
        }catch (Exception e){
            System.out.println("出现错误"+e);
            response.setStatus(ResponseConstants.FAIL_CODE);
        }
        return response;
    }
    //user搜索的次数
    @RequestMapping(value = "/countRecent",produces = MediaType.APPLICATION_JSON_UTF8_VALUE,method = RequestMethod.POST)
    public GenericResponse countRecent(@RequestBody Count count){
        GenericResponse response= new GenericResponse();
        List<Count> result = new ArrayList<>();
        Count b = new Count();
        try{
            if(countMapper.selectAllByPhoneAndMost(count.getMost(),count.getPhone()).size()==0){
                 b.setCount(1);
                 b.setPhone(count.getPhone());
                 b.setMost(count.getMost());
                 countMapper.insert(b);
                 response.setStatus(1);
            }else{
                b.setCount(countMapper.selectAllByPhoneAndMost(count.getMost(),count.getPhone()).get(0).getCount()+1);
                b.setPhone(count.getPhone());
                b.setMost(count.getMost());
                countMapper.update(b);
                response.setStatus(0);
            }
        }catch (Exception e){
            System.out.println("出现错误"+e);
            response.setStatus(ResponseConstants.FAIL_CODE);
        }
        return response;
    }
    @RequestMapping(value="/selectTopFive/{phone}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE,method = RequestMethod.GET)
    public GenericResponse selectTopFive(@PathVariable("phone") String phone){
        GenericResponse response=new GenericResponse();
        List<Count> resuktList = new ArrayList<Count>();
        QueryWrapper<Count> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("count");
        resuktList=countMapper.selectList(wrapper);
        response.setData(resuktList);
        return response;
    }
    //增加prescription的次数
    @RequestMapping(value = "/countMost/{prescription}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE,method = RequestMethod.POST)
    public GenericResponse countMost(@PathVariable("prescription") String prescription){
        GenericResponse response= new GenericResponse();
        try{
            if(prescription!=""&&prescriptionMapper.selectOneByPrescription(prescription)!=null){
               int a = prescriptionMapper.selectOneByPrescription(prescription).getCount();
               a=a+1;
               prescriptionMapper.selectOneByPrescription(prescription).setCount(a);
               response.setData(prescriptionMapper.selectOneByPrescription(prescription).getCount());
               response.setStatus(1);
            }
        }catch (Exception e){
            System.out.println("出现错误"+e);
            response.setStatus(ResponseConstants.FAIL_CODE);
        }
        return response;
    }
    //获取总的prescription的数字
    @RequestMapping(value = "/show/prescription/selectmost/{prescription}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE,method = RequestMethod.GET)
    public GenericResponse selectByprescription(@PathVariable("prescription") String prescription){
        GenericResponse response= new GenericResponse();
        try {
            List<Prescription> sql_results;
                Prescription prescription1 = prescriptionMapper.selectOneByPrescription(prescription);
//          sql_results = prescriptionMapper.selectAllByDisease("%"+disease+"%");
            response.setData(prescription1);
            response.setStatus(1);
        }catch (Exception e){
            System.out.println("出现错误"+e);
            response.setStatus(ResponseConstants.FAIL_CODE);
        }
        System.out.println(response.getData());
        return response;
    }


}
