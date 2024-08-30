package threaddemo;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Emp employee = new Emp();
		Emp employee2 = new Emp(10,"Manager", "Chennai");
		
		System.out.println(employee.hashCode());
		System.out.println(employee2.hashCode());
		
		employee.setEmpId(12);
		
		System.out.println(employee.getEmpId());
	}
}
