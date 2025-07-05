package ex_12_DoWhile;

import java.util.Scanner;

public class CP_checkVowel {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the single chatacter");
		char ch = scan.next().toLowerCase().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Vowel");
		}else if(ch>='a' && ch<='z') {
			System.out.println("Consonent");
		}
		else {
			System.out.println("Invalid Char");
		}
		
//		switch (ch) {	
//        case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
//        default -> System.out.println("consonants");
//    }
	}
}
