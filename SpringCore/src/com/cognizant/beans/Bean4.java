package com.cognizant.beans;

public class Bean4 {
	public Bean4(){
		System.out.println("--Bean4 constructor");
	}
	
	public void initMethod(){
		System.out.println("--init method--");
	}
	
	// before IOC container shuts down
	// destroys method is called
	public void destroyMethod(){
		System.out.println("--destroy method--");
	}
	
}
