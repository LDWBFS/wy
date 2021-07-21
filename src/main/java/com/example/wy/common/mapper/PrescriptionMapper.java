package com.example.wy.common.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wy.common.entity.Prescription;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author FS
 * @since 2021-06-03
 */
public interface PrescriptionMapper extends BaseMapper<Prescription> {
//        List<Prescription> selectall();
        List<Prescription> selectAllByDisease(String diseases);
       Prescription selectOneByPrescription(String presciption);
    List<Prescription> selectOneByPrescription1(String presciption);
}
