package ex_00_Task.Lab_12June;

// Explicit Type Casting
public class Lab_005_ETC_Narrowing {

	public static void main(String[] args) {
		
		// Casts a double to an int, cutting off decimals value.
		
		double A = 100.0;	// Double value
		int B = (int)A;		// Explicitly casted to double
		
		System.out.println(A);
		System.out.println(B);		
	}
}
