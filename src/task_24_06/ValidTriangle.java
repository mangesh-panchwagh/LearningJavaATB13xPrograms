package task_24_06;

import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Side one of triangle : ");
		int side1 = scan.nextInt();
		
		System.out.println("Enter Side two of triangle : ");
		int side2 = scan.nextInt();
		
		System.out.println("Enter Side three of triangle : ");
		int side3 = scan.nextInt();
		
		if(side1+side2>side3 && side2+side3>side1 && side1+side3>side2) {
			System.out.println("Valid Triangle !!!");
		}else {
			System.out.println("invalid Triangle !!!");
		}
	}
}
