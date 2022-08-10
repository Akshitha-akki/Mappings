package com.OneToOneMapping;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) 
	{
		 SessionFactory sf = new Configuration().configure().buildSessionFactory();
	     Session s = sf.openSession();
	     Transaction tx = s.beginTransaction();
	     System.out.println("Hibernate OneToOne Mapping");
	     
	     //Adding of elements
	     /*
	     Question que1 = new Question();
	     que1.setQ_id(4);
	     que1.setQ_Name("Full form of APK?");
	     
	     Answer ans1 = new Answer();
	     ans1.setA_id(104);
	     ans1.setA_Solution("Android Application Package");
	     
	     que1.setA_id(ans1);
	     
	     s.save(que1);
	     s.save(ans1);
	     */
	     //Display
	     List<?> question1 = s.createQuery("from Question").list();
	     for(Iterator<?> iter = question1.iterator(); iter.hasNext();)
	     {
	    	 Question ques = (Question) iter.next();
	    	 System.out.println("Q - "+ques.getQ_id()+" : "+ques.getQ_Name());
	    	 
	    	 Answer ans = ques.getA_id();
	    	 System.out.println("A-"+ans.getA_id()+" : "+ans.getA_Solution());
	     }
	     //Adding of elemets
	     //Question
	 /*  System.out.println("Enter que id and que name ");
	     Scanner scan = new Scanner(System.in);
	     int id = scan.nextInt();
	     String question = scan .nextLine();
	     Question que = new Question(id, question);
	     Integer QueId = (Integer)s.save(que); 
	     //Answer
	     System.out.println("Enter ans id and ans name ");
	     int id = scan.nextInt();
	     String answer = scan .nextLine();
	     Answer ans = new Answer(id, answer);
	     Integer ansid = (Integer)s.save(ans);
	     que1.setA_id(ans1);*/
	     
	     tx.commit();
	     s.close();
	     sf.close();
	}

}
