package ex_00_Task.Lab_12June;

public class Lab_007_DivisionTypecasting {

	public static void main(String[] args) {
		// Program 7: Type casting in Division
        // Description: int a = 10, int b = 3; now divide 10/3 and store the decimal value
        // in the Result variable and print it. 
		
		int a = 10;
		int b = 3;
		
		double result = (double)a/b;
		System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Result of a / b = " + result);
	}
}
