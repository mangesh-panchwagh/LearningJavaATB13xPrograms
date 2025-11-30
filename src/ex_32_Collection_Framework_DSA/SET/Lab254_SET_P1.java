package ex_32_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab254_SET_P1 {
	// Set stores unique values
	// It does not allow to store duplicate values
	public static void main(String[] args) {
		
		Set hs = new HashSet();
		Set lhs = new LinkedHashSet();
		Set ts = new TreeSet();
		
		hs.add("Mangesh");
		hs.add("Mangesh");
		hs.add("Pune");
		
		System.out.println(hs);
	}
}
