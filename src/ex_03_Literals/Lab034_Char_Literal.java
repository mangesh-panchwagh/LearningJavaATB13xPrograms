package ex_03_Literals;

public class Lab034_Char_Literal {

	public static void main(String[] args) {

		char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
		char c2 = 'B';
		char c3 = '@';
		char c4 = '_';
		char c5 = '9';
		char c6 = '1';
		char c7 = '(';

		// Escape Char
		char new_line = '\n';
		char tab_line = '\t';
		char back_space = '\b';
		char carriage_return = '\r';

		System.out.println("MangeshPanchwagh");
		System.out.println("Mangesh" + new_line + "Panchwagh");
		System.out.println("Mangesh" + tab_line + "Panchwagh");
		System.out.println("Mangesh" + back_space + "Panchwagh");
		System.out.println("Mangesh is old" + carriage_return + "Panchwagh");

		System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");
		
		char c10 = 'A';
		// // ASCII, (limited numbers) - A -> 65

		char c11 = '\u1F60';
		char my_laugh_smily = '\u1f60'; // :)
		System.out.println(my_laugh_smily);
	}
}
