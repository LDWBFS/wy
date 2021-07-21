package com.example.wy.common;




import com.example.wy.common.entity.Doctor;
import com.example.wy.common.entity.Other;
import com.example.wy.common.mapper.DoctorMapper;
import com.example.wy.common.mapper.OtherMapper;
import org.junit.jupiter.api.Test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class WyApplicationTests {
    @Autowired
    private OtherMapper otherMapper;
    @Autowired
    private DoctorMapper doctorMapper;
    @Test
    void contextLoads() {
        List<Other> list = otherMapper.selectList(null);
        List<Doctor> list1 = doctorMapper.selectList(null);
        for (Other doctor : list) {
            System.out.println(doctor);
        }
        for (Doctor doctor : list1) {
            System.out.println(doctor);
        }
    }

    }


