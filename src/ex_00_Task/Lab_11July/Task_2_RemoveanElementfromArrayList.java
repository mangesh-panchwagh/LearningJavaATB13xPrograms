package ex_00_Task.Lab_11July;

import java.util.ArrayList;

public class Task_2_RemoveanElementfromArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList();
		al.add("Amit");
	    al.add("Neha");
	    al.add("Suresh");
	    
	    System.out.println(al);
	    al.remove("Neha");
	    
	    System.out.println(al);
	    
	}
}
