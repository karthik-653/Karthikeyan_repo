package pack.com;

public class InnerApp {

		private final static int SIZE=10;
		private int [] arrayOfInts = new int [SIZE];
		
		public InnerApp() {
			for(int i=0;i<SIZE;i++) {
				arrayOfInts[i]=i;
			}
		}
		
		private class InnerClassApp{
			private int next = 0;
			public boolean hasNext() {
				return (next<=SIZE-1);
			}
			public int getNext() {
				int retValue = arrayOfInts[next];
				next+=2;
				return retValue;
			}
		}
		
		public void printEven() {
			InnerClassApp app = new InnerClassApp();
			while(app.hasNext()) {
				System.out.println(app.getNext()+ " ");
			}
		}
	}

