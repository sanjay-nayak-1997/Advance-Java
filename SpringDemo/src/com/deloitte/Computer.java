package com.deloitte;

public class Computer {

	String brandname;
	CPU cpu;
	Computer(CPU cpu)
	{
		this.cpu=cpu;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	
}
