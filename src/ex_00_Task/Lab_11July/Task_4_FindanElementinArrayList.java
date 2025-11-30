package ex_00_Task.Lab_11July;

import java.util.ArrayList;

public class Task_4_FindanElementinArrayList {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Banglore");
		
		System.out.println(al);
		
		if(al.contains("Pune")) {
			System.out.println("Pune is in the list");
		}else {
			System.out.println("Pune is not in the list");
		}
	}
}
