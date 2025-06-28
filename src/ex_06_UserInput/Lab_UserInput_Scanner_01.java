package ex_06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an age : ");
		
		int age = scan.nextInt();
		
		String canIVote = age > 18 ? "Yes" : "No";
		System.out.println(canIVote);
	}
}
