package interfaceexception;

public class CheckMain implements Intr1, Intr2{
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("fein");
	}
	
	public static void main(String[] args) {
		CheckMain c = new CheckMain();
		c.add();	
	}
}

