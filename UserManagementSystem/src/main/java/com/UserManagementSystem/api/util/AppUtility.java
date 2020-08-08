package com.UserManagementSystem.api.util;


public class AppUtility {

	
	public static String concatenateGivenString(String stringOne, String stringTwo, int noOfCharsOfStringOne,
			int noOfCharsOfStringTwo) {

		String firstPart = stringOne.substring(0, noOfCharsOfStringOne);
		String secondPart = stringTwo.substring(0, noOfCharsOfStringTwo);

		return firstPart.concat(secondPart);
	}
	
}
