/*
 * Copyright @2021 Team4
 */
package com.team4.demo.department.service;

import com.team4.demo.department.dao.DepartmentRepository;
import com.team4.demo.department.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long id) {
        return departmentRepository.findAllById(id);
    }

    public Department editDepartment(Department department) {
        return departmentRepository.save(department);
    }

}
