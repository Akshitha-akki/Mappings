package com.OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee 
{
	@Id
	private int eid;
	private String ename;
	private String eAddress;
	private String enumber;
	
	@ManyToOne
	private Department dept ;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String geteAddress() {
		return eAddress;
	}
	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	public String getEnumber() {
		return enumber;
	}
	public void setEnumber(String enumber) {
		this.enumber = enumber;
	}
	public Department getDep() {
		return dept;
	}
	public void setDep(Department dep) {
		this.dept = dep;
	}
	public Employee(int eid, String ename, String eAddress, String enumber) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eAddress = eAddress;
		this.enumber = enumber;
	}
	
}
