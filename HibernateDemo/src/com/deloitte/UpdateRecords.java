package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecords {

	public static void main(String[] args) {
		
		Configuration cnf=new Configuration();
		cnf.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cnf.buildSessionFactory();
		Session sn=sf.openSession();
		
		Transaction tx=sn.beginTransaction();
		
		tx.begin();
		Laptop lt1=(Laptop)sn.get(Laptop.class, 26);
		lt1.setBrandname("HP IND");
		sn.update(lt1);
		tx.commit();
		System.out.println("Record Updated");

	}

}
