package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecord {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Laptop l1=new Laptop();
		l1.setLid(28);
		l1.setBrandname("Lenovo");
		l1.setPrice(150000.0);
		
		Transaction tx=session.beginTransaction();
		tx.begin();
		session.save(l1);
		System.out.println("One row inserted");
		tx.commit();
	}

}
