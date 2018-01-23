package com.ts.us.dao;

import java.sql.*;


import com.ts.us.dto.User;
import com.ts.us.utility.DBUtility;

public class UserDAO {
	
	
	
public User insert(String name,String gender,String email,String pwd,String dob,long mno)

{
	User user = new User();
	Connection con = DBUtility.getCon();
	String query = "insert into user(name,gender,email,password,mobile_number,DOB) values (?,?,?,?,?,?)";
	System.out.println("Query is: "+query);
	try
	{
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString (1,name);
		pstmt.setString (2,gender);
		pstmt.setString (3,email);
		pstmt.setString (4,pwd);
		pstmt.setLong (5,mno);
		java.sql.Date d= java.sql.Date.valueOf(dob);
		pstmt.setDate (6,d);
		int no = pstmt.executeUpdate();
		System.out.println(no+":Record is inserted..");
		
		//Get max id of User
		String query1="select max(id) from user";
		
		System.out.println("query1:"+query1);
		ResultSet res=pstmt.executeQuery(query1);
		if(res.next())
		{
			int id=res.getInt(1);
			
			user.setId(id);
		}
		else
		{
		System.out.println("No Record is available");
		}
		 
	}
	catch(SQLException e)
	{
		e.printStackTrace();
		
	}
	return user;

}

}
