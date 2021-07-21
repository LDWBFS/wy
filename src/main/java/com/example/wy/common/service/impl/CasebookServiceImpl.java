package com.example.wy.common.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wy.common.service.ICasebookService;
import com.example.wy.common.entity.Casebook;
import com.example.wy.common.mapper.CasebookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author FS
 * @since 2021-06-03
 */
@Service
public class CasebookServiceImpl extends ServiceImpl<CasebookMapper, Casebook> implements ICasebookService {
//    @Resource
//    private CasebookMapper casebookMapper;
//
//    @Override
//    public Boolean findCasebook(String phone){
//        if(casebookMapper.selectById(phone)!=null){
//
//        }
//        return true;
//    }
}
