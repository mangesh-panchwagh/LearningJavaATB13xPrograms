package ex_00_Task.Lab_23June;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check positive or negative : ");
		int n = scan.nextInt();

		if (n > 0) {
			System.out.println(n + " is a positive number");
		} else if (n < 0) {
			System.out.println(n + " is a negative number");
		} else {
			System.out.println(n + " is zero");
		}

	}

}
