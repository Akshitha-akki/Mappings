package com.OneToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department 
{
	@Id
	private int d_Id;
	private String dname;
	
	@OneToMany
	private List<Employee> emp ;
	
	public int getD_Id() {
		return d_Id;
	}
	public void setD_Id(int d_Id) {
		this.d_Id = d_Id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
}
