package com.cognizant.beans;

public class Bean5 {
	
	public Bean5(){
		System.out.println("--Bean 5--");
	}
	public static Bean5 createInstance(){
		System.out.println("--create Instance");
		
		// custom instance
		Bean5 bean5 = new Bean5();
		return bean5;
	}
}
