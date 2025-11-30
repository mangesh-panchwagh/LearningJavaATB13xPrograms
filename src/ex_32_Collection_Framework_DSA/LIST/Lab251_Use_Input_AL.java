package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab251_Use_Input_AL {

	public static void main(String[] args) {
		
		// Multiple inputs from the user and store them in separate
        // names, ages - store them
		
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> ages = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		String continueInput = "Y";		// Control variable for input loop
		
		while(continueInput.equalsIgnoreCase("Y")) {
			
			System.out.println("Enter the name : ");
			String name = scan.nextLine();
			names.add(name);
			
			System.out.println("Enter the age : ");
			Integer age = scan.nextInt();
			ages.add(age);
			
			scan.nextLine();
			
            System.out.print("Do you want to enter another record? (Y/N): ");
            continueInput = scan.nextLine();
		}
		
		for(Object o: names) {
			System.out.println(o);
		}
		
		for(Object o2 : ages) {
			System.out.println(o2);
		}
		scan.close();
	}
}
