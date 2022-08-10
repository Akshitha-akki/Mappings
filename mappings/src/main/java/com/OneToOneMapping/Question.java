package com.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question 
{
	@Id
	private int Q_id;
	private String Q_Name;
	
	@OneToOne
	@JoinColumn(name="A_id")
	private Answer A_id;

	public int getQ_id() {
		return Q_id;
	}

	public void setQ_id(int q_id) {
		Q_id = q_id;
	}

	public String getQ_Name() {
		return Q_Name;
	}

	public void setQ_Name(String q_Name) {
		Q_Name = q_Name;
	}

	public Answer getA_id() {
		return A_id;
	}

	public void setA_id(Answer a_id) {
		A_id = a_id;
	}
	
	public Question(int q_id, String q_Name, Answer a_id) {
		super();
		Q_id = q_id;
		Q_Name = q_Name;
		A_id = a_id;
	}

	public Question() {
		super();
	}
	
	
}
