/*
 * Copyright @2021 Team4
 */
package com.team4.demo.department.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private String departmentName;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    @Override
    public String toString() {
        return "User{" + "id=" + this.departmentId + ", name='" + this.departmentName + '\'' + '}';
    }
}
