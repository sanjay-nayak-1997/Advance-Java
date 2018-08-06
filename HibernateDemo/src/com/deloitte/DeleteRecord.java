package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecord {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		tx.begin();
		Laptop lt1=(Laptop)session.get(Laptop.class, 25);
		session.delete(lt1);
		tx.commit();
		System.out.println("Record deleted");

	}

}
