package com.cognizant.di;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectionManager {
	
	ApplicationContext ioc = null;
	
	public ConnectionManager(){
		
		ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	public Connection openConnection(){
		DataSource datasource = (DataSource)ioc.getBean("datasource");
		try{
			Class.forName(datasource.getDriver());
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		Connection connection = null;
		try{
			connection = DriverManager.getConnection(datasource.getUrl(),datasource.getUsername(),datasource.getPassword());
		} catch(SQLException e){
			e.printStackTrace();
		}
		return connection; 
	}
}
