package task_24_06;

import java.util.Scanner;

// 12) Check if a Character is an Alphabet
public class CharacterAlphabet {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter character to check if it is an aplhabet: ");
		char ch = scan.next().charAt(0);
		
		if((ch >='a' && ch<='z' ) || (ch >='A' && ch<='Z' )) {
			System.out.println("Entered character is an alphabet");
		}else {
			System.out.println("Entered character is not an alphabet");
		}
	}
}
