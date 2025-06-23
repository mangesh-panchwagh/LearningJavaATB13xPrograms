package ex_03_Literals;

public class Lab035_Non_Primitive_Literal {

	public static void main(String[] args) {
		
		// primitives are one which cannot be further broken
		// primitive Data Types - Defined by Java Guys
		// Max, Min, Size defined
		byte b = 10;	// 1 Byte -> 8 Bits
		int age = 65;	// 4 Byte -> 32 Bits
		
		// Non-premitive (Defined by users)	, Reference Data Types
		// No size, max, min
		// Byte - 8, Bits - 64
		String name = "Mangesh"; 	// String is a bunch of char
		int[] arrays_of_items = new int [10];
		// String, Arrays, Classes, enum...
		
		// String can also be null.
		// Integral can not be null.
		String s = null;
		 //int age = null;
	}
}
