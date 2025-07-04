package ex_00_Task.Lab_5_17June;

import java.util.Scanner;

import ex_00_Task.Lab_23June.VowelConsonent;

public class Lab_001_VowelConsonantCounter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string for vowel and consonent count : ");
		String str = scan.nextLine();
		
		int vowelCount = 0;
		int consonentCount = 0;
		
		for(int i = 0 ; i< str.length(); i++) {
			
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vowelCount ++;
			else
				consonentCount ++;
		}
		
		System.out.println("Vowel Count : " + vowelCount);
		System.out.println("Consonent Count : " + consonentCount);
	}
}
