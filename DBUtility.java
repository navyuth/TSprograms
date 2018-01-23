package com.ts.us.utility;


	import java.sql.*;

	public class DBUtility {
		
			public static Connection getCon() {
			
				Connection con = null;
			try {
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			String url = "jdbc:mysql://localhost:3306/urbanspoon";
			String uname = "root";
			String pw = "root";
			con = DriverManager.getConnection(url, uname, pw);
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
			}
	}


