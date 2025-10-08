package com.lzp.quickorder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzp.quickorder.entity.Category;
import com.lzp.quickorder.mapper.CategoryMapper;
import com.lzp.quickorder.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
}
