package com.bmpl.testengine.user.helper;

public class UserValidation {
	public static boolean isBlank(String value){
		if(value!=null && value.trim().length()>0){
			return false;
		}
		return true;
	}
	
	public static boolean checkMinLength(String value, int minLength){
		if(value.length()<minLength){
			return true;
		}
		else
		{
			return false;
		}
	}
}
