package ex_06_Ternary_Operator;

// The min number between two numbers by using ternary operator
public class Lab064_TO_Min {

	public static void main(String[] args) {

		int x = 20;
		int y = 30;
		int minNumber = x < y ? x : y;
		
		// System.out.println(Math.min(x,y));
		
		System.out.println(minNumber);
	}
}
