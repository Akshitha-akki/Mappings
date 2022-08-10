package com.OneToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Questions 
{
	@Id
	private int qid;
	private String Qname;
	
	@OneToMany
	private List<Answers> answer;
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return Qname;
	}
	public void setQname(String qname) {
		Qname = qname;
	}
	public List<Answers> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answers> answer) {
		this.answer = answer;
	}
	public Questions(int qid, String qname, List<Answers> answer) {
		super();
		this.qid = qid;
		Qname = qname;
		this.answer = answer;
	}
	public Questions() {
		super();
	}
	
	
}
