package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Updatedatabase {

	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		
		Statement smt = cn.createStatement();
		
		int n = smt.executeUpdate("INSERT INTO emp VALUES ('7000','SMITH','CLERK','7902','1980-12-17','800.00',NULL,'20')");
		
		if(n >= 0) {
			System.out.println(n + " rows updated");
		}else {
			System.out.println("something went wrong");
		}
		
		
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
