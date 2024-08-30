package com.abstractdemo;

public class Bank {
	public static void main(String[] args) {
		Icici i = new Icici();
		Hdfc h = new Hdfc();
		i.checkBalance();
		h.checkBalance();
	}

}