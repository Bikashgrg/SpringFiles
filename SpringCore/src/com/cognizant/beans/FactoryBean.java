package com.cognizant.beans;

public class FactoryBean {
	//factory method
	public Bean5 createInstanceBean5(){
		System.out.println("--createInstance Bean5--");
		Bean5 bean5 = new Bean5();
		return bean5;
	}
}
