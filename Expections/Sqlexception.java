package com.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqlexception {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		
		Statement smt = cn.createStatement();
		
		String sql = "select * from dept";
		
		ResultSet rs = smt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.print(rs.getInt(1) + " |");
			System.out.print(rs.getString(2) + " |");
			System.out.print(rs.getString(3) + " |");
			System.out.println("");
		}

	}

}
