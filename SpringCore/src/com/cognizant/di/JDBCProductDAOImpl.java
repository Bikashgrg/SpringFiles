package com.cognizant.di;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCProductDAOImpl {
	
	ApplicationContext ioc = null;
	public JDBCProductDAOImpl(){
		ioc = new ClassPathXmlApplicationContext("application.xml");
	}
	
	public List getProducts(){
		ConnectionManager manager = new ConnectionManager();
		Connection conn = manager.openConnection();
		ProductQuery query = (ProductQuery)ioc.getBean("productquery");
		try{
			conn.prepareStatement(query.getSelectProducts());
		} catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
}
