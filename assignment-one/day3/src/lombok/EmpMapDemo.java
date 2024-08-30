package lombok;
import java.util.*;

public class EmpMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
		hm.put(1000, new Employee(199, "thala"));
		hm.put(1002, new Employee(112, "virat"));
		hm.put(1004, new Employee(1221, "smriti"));
		for(Map.Entry<Integer, Employee> entry:hm.entrySet()) {
			System.out.println(entry.getValue());
		}
		

		
		
	}
	
}
