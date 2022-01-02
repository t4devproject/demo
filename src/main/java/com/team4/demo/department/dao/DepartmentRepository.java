/*
 * Copyright @2021 Team4
 */
package com.team4.demo.department.dao;

import com.team4.demo.department.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findAllById(Long id);
}
