package com.lpu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	private Integer eid;
	private String ename;

	private String eaddress;
	
	
	@ManyToOne
	@JoinColumn(name = "didFk")
	private Department department;
	
	
	public Employee(){
		
	}
	

	public Employee(Integer eid, String ename, String eaddress, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", department=" + department
				+ "]";
	}
	
	
}