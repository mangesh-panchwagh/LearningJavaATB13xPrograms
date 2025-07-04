package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ_Factorial {

	public static void main(String[] args) {
		
		// Factorial Program = n!=n×(n−1)×(n−2)×⋯×1
        //5! = 5 × 4 × 3 × 2 × 1 = 120
		 Scanner scan = new Scanner(System.in);
	     System.out.println("Welcome to the Factorial Program\nEnter the number!");
	     
	     if(!scan.hasNextInt()) {
	    	 System.out.println("Enter the int you fool!");
	    	 return;
	     }
	     
	     int num = scan.nextInt();
	     long factorial = 1;
	     
	     if(num < 0) {
	    	 System.out.println("Negative Factorial is not allowed !");
	    	 return;
	     }
	     
	     if(num <= 0) {
	    	 System.out.println(factorial);
	     }else {
	    	 // Calculate Factorial
	    	 for(int i = 1; i<=num; i++) {
	    		 factorial = factorial * i;
	    	 }
	     }
	     
	     System.out.println("Factorial : " + factorial);	// Print the calculated Factorial
	}
}
