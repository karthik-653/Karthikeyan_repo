package lombok;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InternalIterator {

	public static void main(String[] args) {
		List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(100, "Aum", "Gujarat"));
		e.add(new Employee(101, "Adhi", "chennai"));
		e.add(new Employee(102, "Adharsh", "Orrisa"));
		e.add(new Employee(103, "Nisha", "chennai"));
		e.add(new Employee(104, "Kunal", "Pune"));
		
		//e.stream().forEach(s->System.out.println(s));
		
		List<String> names = e.stream().filter(s->s.getEmpAddress().startsWith("c")).map(s->s.getEmpName()).toList();
		System.out.println(names);
		
		 //e.stream().filter(s->s.getEmpAddress().startsWith("c")).forEach(s->s.getEmpName());
		
		}
}
