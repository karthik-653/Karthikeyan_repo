package com.exceptions;

public class Voter {
	public static void validate(int age) {
		if(age<18) {
		throw new NumberFormatException("number not valid");
		}
		else {
			System.out.println("eligible to vote");
		}
	}

}
