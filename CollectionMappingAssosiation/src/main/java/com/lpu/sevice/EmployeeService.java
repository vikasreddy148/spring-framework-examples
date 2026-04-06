package com.lpu.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.dao.IEmployeeDao;


import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    IEmployeeDao dao;
    
    
    
	
}



















