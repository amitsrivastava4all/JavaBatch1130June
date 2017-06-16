package org.braincoders.lms.quiz.start;

import java.util.Scanner;

import org.braincoders.lms.quiz.users.User;

public class QuizStart {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.nextLine();
		System.out.println("Enter the Password");
		String password = scanner.nextLine();
		User user = new User(userid, password);
		String message = user.checkLogin();
		System.out.println(message);
		scanner.close();
		
		

	}

}
