package ex_00_Task.Lab_25June;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check ArmstrongNumber : ");
		int num = scan.nextInt();

		if (isArmstrong(num)) {
			System.out.println(num + " is an Armstrong number.");
		} else {
			System.out.println(num + " is NOT an Armstrong number.");
		}
	}
		
	public static boolean isArmstrong(int num) {
		
		int original = num;
		int sum = 0;
		int digits = String.valueOf(num).length();
		
		while(num>0) {
			int digit = num % 10;
			sum += Math.pow(digit, digits);
			num = num / 10;
		}
		
		return sum == original;
	}
	
}
