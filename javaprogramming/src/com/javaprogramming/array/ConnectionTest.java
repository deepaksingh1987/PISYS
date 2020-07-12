package com.javaprogramming.array;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class ConnectionTest {
	
	private String driver="com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/test";
	private String username="root";
	private String password="Deepak@1987";
	
	
	public void showAllRow() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		
		Connection con=DriverManager.getConnection(url, username, password);
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("Select * from human");
		
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			System.out.println("id :"+id +" "+" name :"+name);
		}
		
	}


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ConnectionTest c=new ConnectionTest();
		c.showAllRow();
	}

}
