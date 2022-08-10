package com.ManyToManyMapping;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projects 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int p_id;
	private String Project_create_at;
	private String Project_update_at;
	private String title;
	
	@ManyToMany
	private List<Employees> employees;

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getProject_create_at() {
		return Project_create_at;
	}

	public void setProject_create_at(String project_create_at) {
		Project_create_at = project_create_at;
	}

	public String getProject_update_at() {
		return Project_update_at;
	}

	public void setProject_update_at(String project_update_at) {
		Project_update_at = project_update_at;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}

	public Projects(String project_create_at, String project_update_at, String title) {
		super();
		Project_create_at = project_create_at;
		Project_update_at = project_update_at;
		this.title = title;
	}

	public Projects() {
		super();
  }
	
	
}
