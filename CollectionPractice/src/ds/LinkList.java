package ds;

import java.util.LinkedList;
import java.util.List;

public class LinkList {
	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("NY");
		list.add("FL");
		list.add("AZ");
		list.add("CA");
		
		/*Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		for(String st:list) {
			System.out.println(st);
		}

		System.out.println(list.get(0));
	}

}
