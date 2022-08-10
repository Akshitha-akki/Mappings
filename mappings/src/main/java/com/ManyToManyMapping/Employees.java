package com.ManyToManyMapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Employees 
{
	@Id
	//@GeneratedValue(generator = "Id_generator",strategy = GenerationType.AUTO)
	//@SequenceGenerator(name = "Id_generator",initialValue = 1000)
	private int e_id;
	private String create_at;
	private String update_at;
	@Column(name="ename",length = 15,unique =true)
	private String name;
	
	@ManyToMany
	private List<Projects> project;

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getCreate_at() {
		return create_at;
	}

	public void setCreate_at(String create_at) {
		this.create_at = create_at;
	}

	public String getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(String update_at) {
		this.update_at = update_at;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Projects> getProject() {
		return project;
	}

	public void setProject(List<Projects> project) {
		this.project = project;
	}

	
	public Employees(int e_id, String create_at, String update_at, String name) {
		super();
		this.e_id = e_id;
		this.create_at = create_at;
		this.update_at = update_at;
		this.name = name;
	}

	public Employees() {
		super();
	}

	
}
