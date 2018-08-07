package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSmartPhone {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
		SmartPhone sp=(SmartPhone)ac.getBean("sp");
		System.out.println("Brand Name       : " + sp.getName());
		System.out.println("Price            : " + sp.getPrice());
		System.out.println("Application name : " + sp.apps.getName());
		System.out.println("Application type : " + sp.apps.getType());

	}

}
