package com.lpu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lpu.model.Department;

@Repository
public interface IDepartmentDao extends JpaRepository<Department, Integer> {

}
