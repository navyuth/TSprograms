package com.ts.us.utility;

import java.sql.DriverManager;
import java.sql.*;


public class DAOutility {

	public static void main(String[] args) {
		
		try{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("Successfully registered");
			
			String url = "jdbc:mysql://localhost:3306/urbanspoon";
			String uname = "root";
			String pwd = "root";
			Connection con = DriverManager.getConnection(url, uname, pwd);
			System.out.println("Connection established");
			Statement stmt=con.createStatement();
			System.out.println("Got statement object");	
			
			String query="insert into user values(3,'anil','M','anil@gmail.com','S345677',8988774455,'1999-08-07')";
			System.out.println("Query is:"+query);
			int no=stmt.executeUpdate(query);
			if(no>0){
				System.out.println(no+":Record is inserted please check it.");
			}else{
				System.out.println("Something not right at the moment....");
			}
			
			con.close();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		
		}

	}

}
