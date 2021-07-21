package com.example.wy.common.mapper;

import com.example.wy.common.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author FS
 * @since 2021-05-08
 */
public interface UserMapper extends BaseMapper<User> {
    User loadUserByUsername(String name);
    List<User> selectAllByPhone(String phone);
}
