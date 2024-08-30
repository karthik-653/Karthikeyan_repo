package com.as4;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.as6.Customer;


public class SeedBank {

	private static final CustomerDB customerDB=new CustomerDB();
	private static final Login login=new Login();
	public static void main(String[] args) {
		Customer cust1=new Customer(1001,"Tan",false);
		customerDB.saveCustomer(cust1);
		

		Customer cust2=new Customer(1002,"John",true);
		customerDB.saveCustomer(cust2);
		//customer availing the online service
		login.addLogin(1002, "seed123");

		Customer cust3=new Customer(1003,"Sam",true);
		customerDB.saveCustomer(cust3);
		//customer availing the online service login.addLogin(1003, "Mys@123");

		Customer cust4=new Customer(1004,"Raj",false);
		customerDB.saveCustomer(cust4);
		//customer availing the online service login.addLogin(1004, "Asreet-Tech.com123");

		/*
		* displaying the details of the customers
		*/
		List<Customer> customerList=customerDB.getAllCustomers();
		//checking if the list is empty
		if(customerList.isEmpty()){
		System.out.println("No Customers in the Bank");
		}
		else{
		//calling method for displaying list of customers
			printCustomerList(customerList);
		}
		Set<Integer> loanAvailedCustomers =
				customerDB.getLoanAvailedCustomers();
				System.out.println("\nCustomers who have Availed the loan");
				System.out.println("------------------------------------");
				for(int custId:loanAvailedCustomers){ System.out.println(custId);}
				


	}
	
	public static void printCustomerList(List<Customer>customerList){
		Iterator<Customer> custIterator = customerList.iterator();
		//displaying the header of the report
		System.out.println(" 	Customer Details"); System.out.println("------------------------------"+"-------------");
		System.out.println("cust Id\tcustomer Name\tLoan"+"Availed");
		while(custIterator.hasNext()){
			Customer customer=custIterator.next();
			System.out.print(customer.getCustomerId()+"\t");
			System.out.print(customer.getCustomerName()+"\t\t");
			String displayString="NO";
			if(customer.isLoanAvailed()){
					displayString="YES";
			}
			System.out.println(displayString);
		}
	}

}
