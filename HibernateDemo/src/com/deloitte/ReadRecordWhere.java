package com.deloitte;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class ReadRecordWhere {

	public static void main(String[] args) {
		
		Configuration cnf=new Configuration();
		cnf.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cnf.buildSessionFactory();
		Session sn=sf.openSession();
		
		Criteria c=sn.createCriteria(Laptop.class);
		c.add(Restrictions.gt("price", 100000));
		List list=c.list();
		 Iterator<Laptop> it=list.iterator();
		 while(it.hasNext())
		 {
			 Laptop lt=(Laptop)it.next();
			 System.out.println(lt.getLid() + "           " + lt.getBrandname() + "             " + lt.getPrice());
		 }

	}

}
