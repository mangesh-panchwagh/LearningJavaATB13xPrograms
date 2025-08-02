package StringAssessment;

// String Manipulation Basics
// Write a Java program that demonstrates basic string operations 
// including concatenation, length, substring, and character extraction.
public class StringManipulation {

	public static void main(String[] args) {
		
		String s = "Hello World";
		// Find String length
		System.out.println("Length:" + s.length());
		
		// Find first character of string
		System.out.println("First char:" + s.charAt(0));
		
		// Find Substring
		System.out.println("Substring: " + s.substring(6, 11));
	}

}
