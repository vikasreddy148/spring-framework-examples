package com.lpu.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	private Integer did;
	private String dname;
	private String dlocation;
	
	@OneToMany(mappedBy = "department")
	List<Employee> emps;

	public Department() {
	}
	public Department(Integer did, String dname, String dlocation) {
		super();
		this.did = did;
		this.dname = dname;
		this.dlocation = dlocation;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDlocation() {
		return dlocation;
	}

	public void setDlocation(String dlocation) {
		this.dlocation = dlocation;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", dlocation=" + dlocation + ", emps=" + emps + "]";
	}
	
	
	
	
	
}
