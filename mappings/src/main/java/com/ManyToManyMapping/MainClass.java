package com.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass 
{
	public static void main(String[] args) 
	{ 
		 SessionFactory sf = new Configuration().configure().buildSessionFactory();
	     Session s = sf.openSession();
	     Transaction tx = s.beginTransaction();
	     System.out.println("Hibernate ManyToMany Mapping");
	     
	   /*  Employees e1 = new Employees(101,"10-10-2021","12-2-2022", "Haripriya");
	     Employees e2 = new Employees(102,"10-10-2021","12-2-2022","Jaya");
	     
	     List<Employees> elist = new ArrayList<Employees>();
	     elist.add(e1);
	     elist.add(e2);
	          
	     Projects p1 = new Projects("26-12-2021","11-2-2022","PersonalDesktop");
	     p1.setEmployees(elist);
	     s.save(p1);
	     
	     Projects p2 = new Projects("26-12-2021","11-2-2022","Website");
	     p2.setEmployees(elist);
	     s.save(p2);
	     
	     List<Projects> list = new ArrayList<Projects>();
	     list.add(p1);
	     list.add(p2);
	     
	     e1.setProject(list);
	     e2.setProject(list);
	     
	     s.save(e1);
	     s.save(e2);*/
	     
	     tx.commit();
	     s.close();
	     sf.close();   
	}

}
