package ex_06_Ternary_Operator;

// The maximum number between two numbers by using ternary operator.
public class Lab065_TO_Max {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		//System.out.println(Math.max(x, y));
		
		int maxNumber = x > y ? x : y;
		System.out.println(maxNumber);
	}
}
