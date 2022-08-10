package com.OneToManyMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.OneToOneMapping.Answer;
import com.OneToOneMapping.Question;


public class QAMain {

	public static void main(String[] args) 
	{
		 SessionFactory sf = new Configuration().configure().buildSessionFactory();
	     Session s = sf.openSession();
	     Transaction tx = s.beginTransaction();
	     System.out.println("Hibernate OneToMany Mapping");
	      
	     //Question
	  /*   Questions q = new Questions();
	     q.setQid(2);
	     q.setQname("What is use of 5G Techology?");
	     s.save(q);
	     
	     Answers a = new Answers(201,"More reliability.");
	     a.setQuestion(q);
	     s.save(a);
	     Answers a1 = new Answers(202, "Massive network capacity.");
	     a1.setQuestion(q);
	     s.save(a1);
	     
	     List<Answers> list = new ArrayList<Answers>();
	     list.add(a);
	     list.add(a1);
	     
	     q.setAnswer(list);*/
	     //Display
	     
	     List<?> q = s.createQuery("from questions").list();
	     for(Iterator<?> iter = q.iterator() ; iter.hasNext();)
	     { 
	    	 Questions que = (Questions)iter.next();
	    	 Answers a = (Answers) que.getAnswer();
	    	 System.out.println("Id - "+que.getQid()+" : "+que.getQname());
	    	 System.out.println(a.getId()+" : "+a.getAnswerName());
	     }
	     
	     tx.commit();
	     s.close();
	     sf.close();   
	}

}
