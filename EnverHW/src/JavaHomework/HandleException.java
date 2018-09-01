package JavaHomework;

public class HandleException {
public static void main(String[] args) {
 String languages[]= {"C","C++","JAVA"};
	try {
		for(int c=1; c<=5; c++) {
			System.out.println(languages[c]);
		}
		
	}
	
	catch (Exception e) {
		System.out.println(e);
	}
}
}
