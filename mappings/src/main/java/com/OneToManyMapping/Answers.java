package com.OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers 
{
	@Id
	private int id;
	private String AnswerName;
	
	@ManyToOne
	private Questions question;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswerName() {
		return AnswerName;
	}
	
	public Questions getQuestion() {
		return question;
	}
	public void setQuestion(Questions question) {
		this.question = question;
	}
	public void setAnswerName(String answerName) {
		AnswerName = answerName;
	}
	public Answers(int id, String answerName) {
		super();
		this.id = id;
		AnswerName = answerName;
	}
	public Answers() {
		super();
	}
	
	
}
