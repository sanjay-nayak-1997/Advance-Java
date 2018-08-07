package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetterBasedDI {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
		Computer c=(Computer)ac.getBean("comp");
		System.out.println(c.cpu.getBrandName());

	}

}
