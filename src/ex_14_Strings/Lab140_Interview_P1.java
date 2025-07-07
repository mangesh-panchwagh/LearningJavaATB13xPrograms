package ex_14_Strings;

public class Lab140_Interview_P1 {
/*
	We have JVM. Inside JVM we have class loader and Heap area
	Inside heap area we have String Constant Pool and Object area
	When you create string like String s1 = "Mangesh"; It is created inside String Constant Pool
	But when you create String like String s1 = new String("Mangesh"); String is created in Object area.
*/
	
	public static void main(String[] args) {
		// How many strings are present in string constant pool : 1	
		String s1 = "Hello";
		String s4 = "Hello";
		String s10 = "Hello";
		
		// How many strings are present in string 0bject ares : 3
		String s2 = new String("Hello");
		String s3 = new String("Hello");
		String s5 = new String("Hello");
		
		// SCP : 1, OA : 3, Total : 4
		
	}
}
