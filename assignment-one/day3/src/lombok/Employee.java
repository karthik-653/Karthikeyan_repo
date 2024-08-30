package lombok;

public class Employee {
	private int empId;
	private String empName;
	private String empAddress;
	
	public String toString() {
		return "Employee [empid=" +empId +", empName= " + empName +", empAddress=" + empAddress + "]";
	}
	
	public Employee(int empId, String empName, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		//System.out.println("inside the parameterized constructor");
	}
	
	public Employee() {
		System.out.println("inside the default constructor");
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	

}
 