package com.example.wy.common.service.impl;

import com.example.wy.common.common.GenericResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class saveCasebook {

    @RequestMapping(value = "/case", produces = MediaType.APPLICATION_JSON_UTF8_VALUE,method = RequestMethod.POST)
    public GenericResponse ajax_savecasebook(@RequestParam(required = false) String name, @RequestParam(required = false) String age, @RequestParam(required = false) String hospital,@RequestParam(required = false) String mainsuit,@RequestParam(required = false) String office,@RequestParam(required = false) String PH,@RequestParam(required = false) String PHI  ){
        GenericResponse response = new GenericResponse();
        try{

        }catch (Exception e){

        }
        return response;
    }
}
