package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxInArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(300);
		list.add(1200);
		list.add(400);
		list.add(500);
		
		int maxNumber = Collections.max(list);
		System.out.println("The maximum number is : " + maxNumber);
	}
}
