package com.example.wy.common.controller;


import com.example.wy.common.common.GenericResponse;
import com.example.wy.common.entity.Prescription;
import com.example.wy.common.mapper.PrescriptionMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author FS
 * @since 2021-06-03
 */
@RestController
public class PrescriptionController {
    @Resource
    private PrescriptionMapper prescriptionMapper;

    @RequestMapping(value="/selectByName/{prescription}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE,method = RequestMethod.GET)
    public GenericResponse selectByName(@PathVariable("prescription") String prescription){
        GenericResponse response= new GenericResponse();
        if(prescriptionMapper.selectOneByPrescription(prescription)!=null){
            List<Prescription> p = prescriptionMapper.selectOneByPrescription1(prescription);
            response.setData(p);
            System.out.println(p);
            System.out.println(response.getData());
            response.setStatus(1);
        }else{
            response.setStatus(0);
        }
        return response;

    }


}
