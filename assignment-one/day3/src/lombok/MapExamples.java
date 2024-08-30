package lombok;

import java.util.ArrayList;
import java.util.List;

public class MapExamples {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<String>();
		l.add("Hema");
		l.add("Rahul");
		l.add("Shujay");
		l.add("Shrish");
		l.add("Latha");
		
		//l.stream().sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		List<String> nextGen = l.stream().sorted().map(s->s.toUpperCase()).toList();
		long count = l.stream().filter(s->s.startsWith("S")).count();
		System.out.println(nextGen);
		System.out.println(count);

	}
	

}
