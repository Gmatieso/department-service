package com.techg.department.service;

import com.techg.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    //creating an object of department repository
    @Autowired
    private DepartmentRepository departmentRepository;
}
