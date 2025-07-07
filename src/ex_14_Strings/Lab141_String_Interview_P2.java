package ex_14_Strings;

public class Lab141_String_Interview_P2 {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s4 = "Hello";	// String constant pool 1 string is created
		
		String s2 = new String("Hello");	// OA : Object Area
		String s3 = new String("Hello");	// OA : Object Area
		String s5 = new String("hello");	// OA : Object Area : Total 3 in OA
		
		 // == -> Comparsion -> String -> this check the locations ref.
		
		System.out.println(s1 == s3);	// false : One is present in SCP and other in OA
		System.out.println(s1 == s2);	// false : One is present in SCP and other in OA
		System.out.println(s2 == s3);	// false : 
		
		System.out.println(s1 ==s4);	// true : Both are present in SCP 
		System.out.println(s3 == s5);	// false : 
		
		 // equals ( content) -> value
		
		System.out.println(s1.equals(s2));	// true : equals check content
		System.out.println(s1.equals(s3));	// true : equals check content
		System.out.println(s3.equals(s5));  // false : equals check content
		
		System.out.println(s3.equalsIgnoreCase(s5));  // true
		
		 //  equalsIgnoreCase -> mangesh, Mangesh, MANGESH , ManGesh, MangesH -> mangesh
        //  == - check for the ref
        // = assignment the value
	}
}
