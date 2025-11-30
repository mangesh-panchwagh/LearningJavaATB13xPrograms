package ex_00_Task.Lab_11July;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_5_CompareArrayListvsLinkedListPerformance {

	public static void main(String[] args) {
		
		// ArrayList performance test
		List<Integer> arrayList = new ArrayList();
		long startArrayList = System.currentTimeMillis();
		
		for(int i = 0; i< 100000; i++) {
			arrayList.add(i);
		}
		
		long endArrayList = System.currentTimeMillis();
		long arrayListTimeTaken = endArrayList - startArrayList;
		System.out.println("ArrayList time : " + arrayListTimeTaken + " ms");
		
		// LinkedList performance test
		List<Integer> linkedLlist = new LinkedList();
		long startLinkedList = System.currentTimeMillis();
		
		 for (int i = 0; i < 100000; i++) {
			 linkedLlist.add(i);
	     }
		 
		 long endLinkedList = System.currentTimeMillis();
		 long linkedListTimeTaken = endLinkedList - startLinkedList;
	     System.out.println("LinkedList time: " + linkedListTimeTaken + " ms");
	     
	     if(arrayListTimeTaken < linkedListTimeTaken) {
	    	 System.out.println("Array List is better in performance");
	     }else {
	    	 System.out.println("Linked List is better in performance");
	     }
	}
}
