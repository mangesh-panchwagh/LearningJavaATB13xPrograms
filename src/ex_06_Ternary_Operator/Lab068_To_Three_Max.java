package ex_06_Ternary_Operator;

// Find the maximum between the three numbers.
public class Lab068_To_Three_Max {

	public static void main(String[] args) {

		int n1 = 2;
		int n2 = 9;
		int n3 = -11;

		// Step 1 : Find inputs / outputs
		// I/O -> n1, n2, n3- int
		// O/P -> String -> max number

		// Step 2 : Rough Logic, Think about it
		// n1 > n2 and n1 > n3 -> n1
		// n2 > n3 and n2 > n1 -> n2
		// n3

		// Step 3
		// int max = (n1 > n2) ? A :B;
		// System.out.println(max);

		int maxNumber = (n1 > n2 && n1 > n3) ? n1 : (n2 > n3 && n2 > n1) ? n2 : n3;
		int maxNumber2 = (n1 > n2) ? (n1 > n3) ? n1 : n3 :(n2 > n3) ? n2 : n3;
		// A -> (n1 > n3) ? n1 : n3
		// B -> (n2 > n3) ? n2 : n3
		System.out.println(maxNumber);
		System.out.println(maxNumber2);

	}
}
