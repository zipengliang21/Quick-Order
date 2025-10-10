package com.lzp.quickorder.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzp.quickorder.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
