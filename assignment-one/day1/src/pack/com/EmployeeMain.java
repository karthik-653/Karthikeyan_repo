package pack.com;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee employee2 = new Employee(10,"Manager", "Chennai");
		
		System.out.println(employee.hashCode());
		System.out.println(employee2.hashCode());
		
		employee.setEmpId(12);
		
		System.out.println(employee.getEmpId());
	}
}
