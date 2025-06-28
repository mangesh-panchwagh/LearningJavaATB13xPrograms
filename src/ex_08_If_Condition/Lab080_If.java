package ex_08_If_Condition;

import java.util.Scanner;

public class Lab080_If {

	public static void main(String[] args) {
		
		System.out.println("Enter Age");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		if(age > 18) {
			System.out.println("Allowed to Vote!");
		}
	}
}
