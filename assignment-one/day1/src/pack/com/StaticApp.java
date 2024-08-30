package pack.com;

public class StaticApp {

	public static int a = 10;
	public static int b;
	
	public static int add(int c) {
		b=a+c;
		return b;
	}
	static{
		System.out.println("Im first ahaha");
	}
	
	
}
