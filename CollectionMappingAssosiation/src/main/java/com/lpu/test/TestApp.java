package com.lpu.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lpu.dao.IDepartmentDao;
import com.lpu.dao.IEmployeeDao;
import com.lpu.model.Department;
import com.lpu.model.Employee;
import com.lpu.sevice.DepartmentService;
import com.lpu.sevice.EmployeeService;

@Component
public class TestApp implements CommandLineRunner{

	@Autowired
	EmployeeService empService;
	
	@Autowired
	DepartmentService depService;
	
	@Autowired
	IDepartmentDao depDao;
	
	@Autowired
	IEmployeeDao empDao;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("testing code .........");
//		
//		List<Department> Dpts=List.of(new Department(100,"CSE","BLR"),new Department(101,"ECE","HYD"),new Department(102,"EEE","PUNE"));
//    	
//    	
//    	List<Employee> emps=List.of(new Employee(7, "Dhoni","Chennai", Dpts.get(0)),new Employee(18, "kholi","bangalore", Dpts.get(0)),new Employee(10, "Abhishek","Hyderabed", Dpts.get(1)));
//    	
//    	depDao.saveAllAndFlush(Dpts);
//    	System.out.println("*****************Depts saved successfully*************");
//    	empDao.saveAllAndFlush(emps);
//    	System.out.println("*****************Emps saved successfully*************");
    	
		System.out.println(depDao.getClass().getName());
		System.out.println(empService.getClass().getName());
		
		
	}
	
}
