package com.deloitte;
public class SmartPhone {

	String name;
	double price;
	Application apps;
	
	public SmartPhone(Application apps) {
		this.apps = apps;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
