package ex_32_Collection_Framework_DSA.LIST;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab248_Vector_ListIterator {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector();
		vector.add("Item1");
        vector.add("Item2");
        vector.add("Item3");
        vector.add("Item4");
        vector.add("Item5");
        
        System.out.println(vector);
        
        System.out.println("-------List Iterator");
        ListIterator listIterator = vector.listIterator();
        while(listIterator.hasNext()) {
        	System.out.println(listIterator.next());
        }
        System.out.println("-------List Iterator previous");
        while(listIterator.hasPrevious()) {
        	System.out.println(listIterator.previous());
        }
        
        System.out.println("------- Iterator");
        Iterator it = vector.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
	}
}
