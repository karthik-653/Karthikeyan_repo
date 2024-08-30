package exceptiondemo;

import java.io.FileNotFoundException;

public class EmployeeMain {
public static void main(String[] args) {
	EmployeeDao e = new EmployeeDaoImp1();
//	try {
//		e.EmployeeData(new Employee(101,"admin"));
//	} catch (FileNotFoundException e1) {
//		// TODO Auto-generated catch block
//		System.out.println("Error babe");
//		e1.printStackTrace();
//	}
	
	try {
		e.EmployeeData(new Employee(101,"admin"));
	} catch (DataAccessException e1) {
		// TODO Auto-generated catch block
//		e1.printStackTrace();
	System.out.println(e1.getMessage());
	}
	
	System.out.println("employee saved");
}
}
