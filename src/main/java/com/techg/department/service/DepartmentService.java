package com.techg.department.service;

import com.techg.department.entity.Department;
import com.techg.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    //creating an object of department repository
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService");
        return  departmentRepository.save(department);
    }

        public Department findDepartmentById(Long departmentId) {
            log.info("Inside findDepartmentById method of DepartmentService");
            return departmentRepository.findByDepartmentId(departmentId);

        }
}
