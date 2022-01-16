package com.stech.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	 private static final String driver="com.mysql.cj.jdbc.Driver";
	    private static  final String url="jdbc:mysql://localhost:3306/hostelmgtsys";
	    private static  final String username="root";
	    private static   final String password="root";
	    
	    private static Connection con;
	    
	    public static Connection connectDB() {
	    	 try {
	     		  Class.forName(driver);
	     		  try {
	     			  con=DriverManager.getConnection(url, username,password);
	     		
	     			 }catch(SQLException e) {
	     				 System.out.println("Failed to Connect");
	     			 }
	     	  }catch(ClassNotFoundException e) {
	     		  System.out.println("Driver not found");
	     	  }
	     	  return con;
	       }
	 
	  
}
