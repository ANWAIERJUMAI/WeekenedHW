package finalize;

public class TestFinalize {
public static void main(String[] args) {
	TestFinalize tf= new TestFinalize();
	tf.finalzie();
	String st= new String();
	System.out.println(st);
	System.gc(); 
	
	System.out.println("End of main ");
	System.gc();
}
public void finalzie() {
	System.out.println("Finalize method has been called...");
	
}
}
