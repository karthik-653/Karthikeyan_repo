package com.singleton;

public class Emp {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s.hashCode());
		
		Singleton y = Singleton.getInstance();
		System.out.println(y.hashCode());
	}

}
