package com.lzp.quickorder.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzp.quickorder.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
