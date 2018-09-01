package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		queue.add("NY");
		queue.add("FL");
		queue.add("AZ");
		
		//using for each traverse through the LinkedList
		Iterator it=queue.iterator();
		while (it.hasNext()){
		System.out.println(queue.poll());
		}
		//
		while (!queue.isEmpty()) {
		System.out.println(queue.poll());}
		
	}

}
