package com.cts.demo.singleton;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {

	// a static reference variable
	// static means only one copy of the 
	// member
	private static Connection connection;
	
	// private constructor , 
	// private constructor so that the 
	// constructor is not accessible 
	// outside the class 
	
	/*
	 * private DBConnection() { try { Driver driver=new com.mysql.cj.jdbc.Driver();
	 * if(connection==null) { connection=DriverManager.getConnection(
	 * "jdbc:mysql://localhost:3306/DB29April","root","password@123"); } } catch
	 * (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * }
	 */
	   
	   public static Connection getConnection()
	   {
		   try {
			Driver driver=new com.mysql.cj.jdbc.Driver();
		
		   if(connection==null) { 
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/DB29April","root","password@123");
		   }  
		   } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return connection; 
	   
	   }         
}
