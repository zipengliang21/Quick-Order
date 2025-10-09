package com.lzp.quickorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzp.quickorder.dto.SetmealDto;
import com.lzp.quickorder.entity.Setmeal;

public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);
}
