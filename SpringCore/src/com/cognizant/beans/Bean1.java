package com.cognizant.beans;

// Infrastructure services for eg Security, Tracing, Debugging,
// Performance Monitoring, Persistence, Databases operations etc.

// Spring Bean is infrastructure service class which provides above mentioned infrastructure services.

// Spring Bean life cycle are managed by IOC Container(Loosely Coupled Container)

// Information(configuration) required to manage life cycle of spring bean must be provided either using 
// XML or annotations.

public class Bean1 {
	
	// method provides some infrastructure services
	public void x(){
		System.out.println("This is a bean class.");
	}

}
