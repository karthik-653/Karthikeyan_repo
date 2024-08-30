package com.exceptions;

public class Exception {

	public static void main(String[] args) {
		int a,b,c;
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = a/b;
			System.out.println("division is: " + c);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Give 2 values");
		}
		catch(ArithmeticException e) {
			System.out.println("2nd value can't be zero");
		}
	
	}
}
