package task_24_06;

import java.util.Scanner;
// 13) Check if a number is Prime
public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check prime number : ");
		int num = scan.nextInt();

		boolean isPrime = true;

		if (num < 2) {
			isPrime = false;
		} else {
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}
}
