package com.lzp.quickorder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzp.quickorder.entity.User;
import com.lzp.quickorder.mapper.UserMapper;
import com.lzp.quickorder.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
