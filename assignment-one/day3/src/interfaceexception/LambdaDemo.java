package interfaceexception;

public class LambdaDemo {
	
	public static void execute(Worker worker) {
		worker.doWork();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		execute(() -> System.out.println("Hi"));

	}

}
