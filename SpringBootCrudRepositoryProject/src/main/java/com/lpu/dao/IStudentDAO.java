package com.lpu.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lpu.model.Student;

@Repository
public interface IStudentDAO extends CrudRepository<Student, Integer> {

}