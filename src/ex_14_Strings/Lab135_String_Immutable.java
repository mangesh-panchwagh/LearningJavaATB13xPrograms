package ex_14_Strings;

public class Lab135_String_Immutable {

	public static void main(String[] args) {
		
		String name = "Mangesh";	// This will be created in string constant pool
		//name.toUpperCase();
		name = name.toUpperCase();
		System.out.println(name);
		
	}
}
