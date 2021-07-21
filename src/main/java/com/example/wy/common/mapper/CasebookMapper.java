package com.example.wy.common.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wy.common.entity.Casebook;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author FS
 * @since 2021-06-03
 */
public interface CasebookMapper extends BaseMapper<Casebook> {
    List<Casebook> selectAllByPhone(String phone);
}
