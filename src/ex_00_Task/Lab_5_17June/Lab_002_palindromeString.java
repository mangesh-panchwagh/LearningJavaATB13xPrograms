package ex_00_Task.Lab_5_17June;

import java.util.Scanner;

public class Lab_002_palindromeString {

	public static void main(String[] args) {
		
		System.out.println("Enter the string to check for palindrome : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		boolean res = palindromeString(str);
		
		if(res)
			System.out.println("Entered String " + str + " is palindrome");
		else
			System.out.println("Entered String " + str + " is not apalindrome");
		
	}

	private static boolean palindromeString(String str) {
		
		String revString = "";
		
		for(int i = str.length()-1;i>=0;i--) {
			revString += str.charAt(i);
		}
		
		if(revString.equals(str)) {
			return true;
		}else {
			return false;
		}
	}
}
