package lombok;

import java.util.ArrayList;
import java.util.List;

public class EmpApp {
	public static void main(String[] args) {
		List<Employee> empList = addEmployee();
		System.out.println(searchEmployee(empList, "Mahi"));
	}
	
	public static List<Employee> addEmployee() {
		List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(100, "Kiran", "chennai"));
		e.add(new Employee(104, "Karthik", "chennai"));
		e.add(new Employee(102, "Pandey", "Bombay"));
		e.add(new Employee(103, "Ishan", "Bengaluru"));
		
		return e;
	}
	
	public static Employee searchEmployee(List<Employee> empList, String nameReqd) {
		for(Employee e:empList) {
			if(e.getEmpName().contentEquals(nameReqd)) {
				System.out.println(e.getEmpName() + " is there in the list");
				return e;
			}
		}
		System.out.println(nameReqd + " is not there in the list");
		return null;
		
	}

}
