package com.example.mbpdemo1.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mbpdemo1.dao.TblEmployeeDao;
import com.example.mbpdemo1.entity.TblEmployee;
import com.example.mbpdemo1.service.TblEmployeeService;
import org.springframework.stereotype.Service;

/**
 * (TblEmployee)表服务实现类
 *
 * @author makejava
 * @since 2018-08-03 01:34:01
 */
@Service
public class TblEmployeeServiceImpl extends ServiceImpl<TblEmployeeDao, TblEmployee> implements TblEmployeeService {

}