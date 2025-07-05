package ex_00_Task.Lab_6_18June;

import java.util.Scanner;

public class Lab_001_LeapYearChecker {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year to check leap year :");
		int year = scan.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is a not leap year.");
		}
	}
}
