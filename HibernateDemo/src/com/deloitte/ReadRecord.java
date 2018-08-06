package com.deloitte;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadRecord {

	public static void main(String[] args) {
		
		Configuration cnf=new Configuration();
		cnf.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cnf.buildSessionFactory();
		Session sn=sf.openSession();
		
		Query qry=sn.createQuery("from com.deloitte.Laptop");
		List list=qry.list();
		 Iterator<Laptop> it=list.iterator();
		 while(it.hasNext())
		 {
			 Laptop lt=(Laptop)it.next();
			 System.out.println(lt.getLid() + "           " + lt.getBrandname() + "             " + lt.getPrice());
		 }

	}

}
