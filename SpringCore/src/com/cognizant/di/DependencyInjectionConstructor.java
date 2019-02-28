package com.cognizant.di;

import java.sql.Connection;

public class DependencyInjectionConstructor {
	public static void main(String[] args){
		
		ConnectionManager manager = new ConnectionManager();
		Connection connection = manager.openConnection();
	}
}
