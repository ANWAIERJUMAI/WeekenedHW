package JavaHomework;

public class LoopExamples {
	public static void main(String[] args) {
		//for loop
		for (int i=10; i>=0; i--) {
			System.out.println("number: "+ i);
			
			// while loop 
			int a=20;
			while(a>12) {
				System.out.println("a = " +a);
				a--;
				
				// do while
				int b=16;
				do {
					System.out.println(b);
					b--;
				}while(b>1);
			}
			
		}
		
	}

}
