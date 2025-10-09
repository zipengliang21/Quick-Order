package com.lzp.quickorder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzp.quickorder.entity.SetmealDish;
import com.lzp.quickorder.mapper.SetmealDishMapper;
import com.lzp.quickorder.service.SetmealDishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealDishServiceImpl extends
        ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {
}
