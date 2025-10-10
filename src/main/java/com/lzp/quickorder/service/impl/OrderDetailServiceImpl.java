package com.lzp.quickorder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzp.quickorder.entity.OrderDetail;
import com.lzp.quickorder.mapper.OrderDetailMapper;
import com.lzp.quickorder.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
