package com.lzp.quickorder.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzp.quickorder.entity.Employee;
import com.lzp.quickorder.mapper.EmployeeMapper;
import com.lzp.quickorder.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
