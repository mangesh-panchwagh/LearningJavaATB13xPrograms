package ex_00_Task.Lab_11July;

import java.util.LinkedList;

public class Task_6_InsertinMiddleofLinkedList {

	public static void main(String[] args) {
		
		 // Create LinkedList with initial fruits
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		
		System.out.println(fruits);
		
		fruits.add(1,"Orange");
		System.out.println(fruits);
	}
}
