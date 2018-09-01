package JavaHomework;

public class NestedClass {
	public static int a=20;
	public static void main(String[] args) {
		System.out.println(a);
	}
	class A{
		NestedClass N= new NestedClass();
		int b=N.a;
		
	}
	

}
