package com.lpu.sevice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.dao.IStudentDAO;
import com.lpu.model.Student;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {

    @Autowired
    IStudentDAO dao;
    
    public Optional<Student> findStudentById(Integer id) {
        return dao.findById(id);
    }

	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		dao.save(student);
		
	}

	public Iterable<Student> getAllStudents() {
        return dao.findAll();
    }

	public void deleteStudent(Integer id) {
        dao.deleteById(id);
    }
	
	public long countStudents() {
        return dao.count();
    }
	
	public boolean existsStudent(Integer id) {
        return dao.existsById(id);
    }

	public void saveAllStudent(List<Student> list) {
		// TODO Auto-generated method stub
		dao.saveAll(list);
		
	}

	public Iterable<Student> findStudentAllById(List<Integer> ids) {
		return dao.findAllById(ids);
		
	}
	
	public void deleteStudentsByIds(Iterable<Integer> ids) {
	    dao.deleteAllById(ids);
	}

	public void deleteAllStudents() {
		// TODO Auto-generated method stub
		dao.deleteAll();
	}
}