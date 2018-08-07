package com.deloitte;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringWelcome {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
		
		Computer c=(Computer)ac.getBean("comp");
		System.out.println(c.getBrandname());
		System.out.println(c.cpu.getCpubrand());
	}

}
