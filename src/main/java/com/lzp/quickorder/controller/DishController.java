package com.lzp.quickorder.controller;

import com.lzp.quickorder.service.DishFlavorService;
import com.lzp.quickorder.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 菜品管理
 */
@RestController
@RequestMapping("/dish")
@Slf4j
public class DishController {

    @Autowired
    private DishService dishService;
    
    @Autowired
    private DishFlavorService dishFlavorService;
}