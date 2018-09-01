package finalize.Singleton.nestedloop;

import java.util.ArrayList;
import java.util.List;

public class UseOfArrayList {
	public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(15);
	list.add(1, 10);
	
	
	
	System.out.println(list.get(0));
	System.out.println(list.get(1));
	System.out.println(list.get(2));
	
	}

}
