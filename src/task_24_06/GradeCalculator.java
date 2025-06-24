package task_24_06;

import java.util.Scanner;
// 11) Calculate Grade based on marks
public class GradeCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks to detemine Grade in the range of 0 to 100: ");
		int grade = scan.nextInt();

		if (grade >= 90 && grade <= 100) {
			System.out.println("You have got Grade A+");
		} else if (grade >= 80 && grade <= 89) {
			System.out.println("You have got Grade A");
		} else if (grade >= 70 && grade <= 79) {
			System.out.println("You have got Grade B");
		} else if (grade >= 60 && grade <= 69) {
			System.out.println("You have got Grade C");
		} else if (grade >= 50 && grade <= 59) {
			System.out.println("You have got Grade D");
		} else if (grade >= 40 && grade <= 49) {
			System.out.println("You have got Grade E");
		} else if (grade < 40) {
			System.out.println("Fail");
		} else {
			System.out.println("Please enter marks in given range");
		}
	}
}
