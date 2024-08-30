package com.as6;

@Data
public class Account {
	private int accountNo;
	private Customer customer;
	protected double balance;
	public Account(int accountNo,Customer customer,double balance){
		this.accountNo=accountNo;
		this.balance=balance;
		this.customer=customer;
	}
	public Account(){}

}
