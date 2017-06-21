package com.tcs.social.user.views;

import com.tcs.social.user.dao.User;
import com.tcs.social.user.dao.UserDAO;

public class RegisterView extends User {
	void printDetails(){
		System.out.println(userid);
		System.out.println(userName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO userDAO = new UserDAO();
		//System.out.println(userDAO.x);
		userDAO.register();
		

	}

}
