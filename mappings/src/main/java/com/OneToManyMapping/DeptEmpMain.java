package com.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeptEmpMain {

	public static void main(String[] args) {
		 SessionFactory sf = new Configuration().configure().buildSessionFactory();
	     Session s = sf.openSession();
	     Transaction tx = s.beginTransaction();
	     System.out.println("Hibernate OneToMany Mapping");
	     
	     Department dept = new Department();
	     dept.setD_Id(502);
	     dept.setDname("ECE");
	     s.save(dept);
	     
	     Employee emp1 = new Employee(2,"Priya","Hyderabad","8979495621");
	     emp1.setDep(dept);
	     s.save(emp1);
	     
	     List<Employee> list = new ArrayList<Employee>();
	     list.add(emp1);
	     dept.setEmp(list);
	     
	     tx.commit();
	     s.close();
	     sf.close();
	}

}
