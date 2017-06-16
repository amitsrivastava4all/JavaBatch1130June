package org.braincoders.lms.quiz.users;

public class UserDAO {
	
	private User[] prepareUsers(){
		User users[] = new User[5];
		users[0] = new User("amit","1234");
		users[1] = new User("ram","9999");
		users[2] = new User("tim","5454");
		return users;
		
	}
	
	public User[] getUsers(){
		return prepareUsers();
	}

}
