package com.example.wy.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wy.common.entity.Count;

import java.util.List;

public interface CountMapper extends BaseMapper<Count> {
          List<Count> selectAllByMost(String most);
    List<Count> selectAllByPhoneAndMost(String most,String phone);

    int update(Count b);
}

