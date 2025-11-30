package ex_00_Task.Lab_11July;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Task_3_ReverseaLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList();
		ll.add("Rahul");
		ll.add("Sachin");
		ll.add("Saurav");
		ll.add("Laxman");
		
		System.out.println(ll);
		System.out.println(ll.reversed());
		
		
	}
}
