package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("Dipak");
		list.add("Ravi");
		list.add("Sneha");
		list.add("Priya");
		list.add("Anjali");
		System.out.println(list);
		
		System.out.println("-------Using iterator");
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("-------Using for loop");
		for(Object o : list) {
			System.out.println(o);
		}
		
	}
}
