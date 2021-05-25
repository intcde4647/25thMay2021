package com.cts.demo.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDB {
  
	     private Connection connection;
	     private Statement statement;
	     
	     public void readEmployeeData() throws SQLException
	     {
	    	 try
	    	 {
	    	      connection=DBConnection.getConnection();     
	    	      statement=connection.createStatement();
	    	      ResultSet result=statement.executeQuery("SELECT firstname,desig FROM employee_master");
	    	      while(result.next())
	    	      {
	    	    	  System.out.println(result.getString("firstname")+"\t"+result.getString("desig"));
	    	      }
	    	      
	    	 }finally {
	    		 if(connection!=null)
	    		 {
	    			 connection.close();
	    		 }
	    	 }
	    	      
	     }
	     
	
}
