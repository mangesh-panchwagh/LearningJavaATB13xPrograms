package task_24_06;

import java.util.Scanner;

// 10) Check if year is leap year
public class LeapYear {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year to check leap year : ");
		int year = scan.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			System.out.println("Entered year " + year + " is leap year");
		} else {
			System.out.println("Entered year " + year + " is not a leap year");
		}
	}
}
