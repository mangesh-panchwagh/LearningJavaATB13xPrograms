package ex_00_Task.Lab_11July;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_1_AddandDisplayElementsinArrayList {

	public static void main(String[] args) {
		
		List al = new ArrayList();
		al.add("Dipak");
        al.add("Ravi");
        al.add("Sneha");
        al.add("Priya");
        al.add("Anjali");
        
        System.out.println(al);
        System.out.println("---Using for loop");
        for(int i = 0 ;i <al.size(); i++) {
        	System.out.println(al.get(i));
        }
        
        System.out.println("---Using Iterator");
        Iterator iterator = al.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
	}
}
