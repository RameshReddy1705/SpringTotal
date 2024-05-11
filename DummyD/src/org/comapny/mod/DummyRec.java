package org.comapny.mod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DummyRec
{
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt =null;
		String s="insert into lap.lap values(3,'ghju','jufgd',8,'ramesh')";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connection Created");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			System.out.println("Statement Created");
			stmt= con.createStatement();
			System.out.println("Statement Executed");
			stmt.execute(s);
			System.out.println("All Done");
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(stmt!=null)
			{
				try {
					stmt.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
		}
	}
	
}
