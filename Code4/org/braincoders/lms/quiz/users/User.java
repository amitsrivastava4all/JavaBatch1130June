package org.braincoders.lms.quiz.users;

public class User {
	private String userid;
	private String password;
	public User(String userid, String password){
		this.userid = userid;
		this.password = password;
	}
	public String checkLogin(){
		UserDAO userDAO = new UserDAO();
		User users[] = userDAO.getUsers();
		String message = "Invalid Userid or Password";
		for(User user : users){
			if(user!=null){
			if(user.userid.equals(userid) && 
					user.password.equals(password)){
				message = "Welcome "+userid;
				break;
			}
			}
		}
		return message;
		/*if(userid.equals(password)){
			return "Welcome "+userid;
		}
		else
		{
			return "Invalid Userid or Password";
		}*/
	}
}
