package com.lzp.quickorder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzp.quickorder.dto.DishDto;
import com.lzp.quickorder.entity.DishFlavor;
import com.lzp.quickorder.mapper.DishFlavorMapper;
import com.lzp.quickorder.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
