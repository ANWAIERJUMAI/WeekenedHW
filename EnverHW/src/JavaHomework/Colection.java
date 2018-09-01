package JavaHomework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Colection {
	//Array
	public static void main(String[] args) {
		int a[]=new int[2];
		a[0]=1;
		a[1]=2;
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
		
		//ArrayList
		ArrayList<String> ab=new ArrayList<String>();
		ab.add("cola");
		ab.add("Fanta");
		System.out.println("company is" +ab);
		ab.set(0, "Oghlem");
		System.out.println(ab);
		//LinkedList
		LinkedList<String> c=new LinkedList<String>();
		c.add("Water");
		System.out.println(c);
		
		
	}

}
