package task_24_06;

import java.util.Scanner;

// 9) Find largest of two numbers
public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = scan.nextInt();
		
		System.out.println("Enter second number");
		int n2 = scan.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1 + " is a largest number");
		}else {
			System.out.println(n2 + " is a largest number");
		}
	}
}
