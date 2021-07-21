package com.example.wy.common.service.impl;

import com.example.wy.common.entity.Doctor;
import com.example.wy.common.mapper.DoctorMapper;
import com.example.wy.common.service.IDoctorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author FS
 * @since 2021-05-08
 */
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor> implements IDoctorService {

}
