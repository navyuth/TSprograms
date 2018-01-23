package com.ts.us.test;

import com.ts.us.dao.UserDAO;
import com.ts.us.dto.User;

public class TestApp
{
	public static void main(String args[])
	{
		UserDAO dao = new UserDAO();
		String uname = "Navy";
		String gender = "Male";
		String email = "navy@gmail.com";
		String password = "navy@123";
		String dob = "1994-08-27";
		long mno = 8978906225l;
		
		User user = new User();
		user.setName(uname);
		user.setGender(gender);
		user.setEmail(email);
		user.setPassword(password);
		user.setDOB(java.sql.Date.valueOf(dob));
		user.setmobile_number(mno);
		User u = dao.insert(uname,gender,email,password,dob,mno);
		System.out.println("Id is :"+u.getId());
	}
}
