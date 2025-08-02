package StringAssessment;

// String Comparison and Equality
// Create a program that demonstrates different ways to 
// compare strings in Java, including == operator, equals(), 
// equalsIgnoreCase(), and compareTo() methods.
/*
input : 
String1: "Hello", String2: "hello", String3: "Hello"
Output : equals(): false, equalsIgnoreCase(): true, compareTo(): -32
*/
public class StringComparisonAndEquality {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "hello";
		String s3 = "Hello";

		System.out.println("equals(): " + s1.equals(s2));
		System.out.println("equalsIgnoreCase(): " + s3.equalsIgnoreCase(s2));
		System.out.println("compareTo(): " + s1.compareTo(s2));
		System.out.println(s1 == s2);
		System.out.println(s2.equals(s3));
	}

}
