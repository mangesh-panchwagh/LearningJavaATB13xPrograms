package ex_00_Task.Lab_6_18June;

import java.util.Scanner;

public class Lab_002_GradeCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks :");
		int marks = scan.nextInt();
		
		if(marks >=90 && marks <=100) {
			
			System.out.println("Grade : A" );
			
		}else if(marks >=80 && marks <=89) {
			
			System.out.println("Grade : B" );
			
		}else if(marks >=70 && marks <=100) {
			
			System.out.println("Grade : C" );
			
		}else if(marks >=60 && marks <=79) {
			
			System.out.println("Grade : D" );
			
		}else if(marks >=0 && marks <=59) {
			
			System.out.println("Grade : F" );
		}else {
			System.out.println("Invalid score. Please enter a value between 0 and 100.");
		}
		
	}
}
