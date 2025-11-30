package ex_32_Collection_Framework_DSA.SET;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Lab255_HS_LHS_TS {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		// Hashing mechanism to store the element
		// no order maintained
		// no duplicates
		// e1 -> hashcode(xyz), e2 -> hashcode ->abc
		
		hs.add("Apple");
		hs.add("Orange");
		hs.add("Watermelon");
//		hs.add(123);	
		hs.add(null);
//		hs.add(null);
		
		System.out.println(hs);
		
		for(String s: hs) {
			System.out.println(s);
		}
		
		System.out.println(" ------------Iterator for HashSet---------------");
		Iterator itertor = hs.iterator();
		while(itertor.hasNext()) {
			System.out.println(itertor.next());
		}
		
		System.out.println(" ----------Linked HashSet-----------------");
		Set lhs = new LinkedHashSet<>();
		
		// LinkedList mechanism to store the element,
        // order will maintain, no duplicates
		lhs.add("Dpple");
		lhs.add("Apple");
		lhs.add("Orange");
		lhs.add("Watermelon");
		lhs.add("Watermelon");
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains("Apple"));
		System.out.println(lhs.size());
		
		System.out.println(" ----------TreeSet-----------------");
		
		Set ts = new TreeSet();
		// Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.
		
		ts.add("Dapple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("WaterMelon");
//      ts.add(123);
//      ts.add(null);
        
        System.out.println(ts);
        
        System.out.println(" ----- For Each ---- ");
        for(Object o : ts) {
        	System.out.println(o);
        }
	}
}
