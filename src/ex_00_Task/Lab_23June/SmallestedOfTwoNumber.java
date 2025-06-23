package ex_00_Task.Lab_23June;

import java.util.Scanner;

public class SmallestedOfTwoNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = scan.nextInt();

		System.out.println("Enter number 2");
		int num2 = scan.nextInt();

		if (num1 < num2) {
			System.out.println(num1 + " is a smallest number");
		} else {
			System.out.println(num2 + " is a smallest number");
		}
	}
}
