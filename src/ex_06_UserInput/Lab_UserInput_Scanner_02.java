package ex_06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s = scan.next();
		System.out.println(s);
		
		System.out.println("Enter the Int : ");
		int int_input = scan.nextInt();
		
		System.out.println("Enter the Double : ");
		double double_input = scan.nextDouble();
		System.out.println(double_input);
	}
}
