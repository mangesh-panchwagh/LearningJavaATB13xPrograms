package ex_00_Task.Lab_13une;

public class Lab_002_IDO_Program_2 {

	public static void main(String[] args) {
		
		// Program 2
		int i = 1;
		i = i++ + ++i;
		
		System.out.println(i);
				
		// A + B
		// A -> i++ -> ExpA -> 1, a = 2
		// +
		// B -> ++i -> ExpA -> 1, b = 2
		
		// Line no | a | Exp
		// 8 | 1 | 2
		// 9 | 2 | 2+2 -> 4
				
	}
}
