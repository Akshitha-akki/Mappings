package com.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer 
{
	@Id
	private int A_id;
	private String A_Solution;
	public int getA_id() {
		return A_id;
	}
	public void setA_id(int a_id) {
		A_id = a_id;
	}
	public String getA_Solution() {
		return A_Solution;
	}
	public void setA_Solution(String a_Solution) {
		A_Solution = a_Solution;
	}
	public Answer(int a_id, String a_Solution) {
		super();
		A_id = a_id;
		A_Solution = a_Solution;
	}
	public Answer() {
		super();
	}
	
	
}
