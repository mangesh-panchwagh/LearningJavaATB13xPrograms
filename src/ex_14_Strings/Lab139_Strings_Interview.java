package ex_14_Strings;

public class Lab139_Strings_Interview {

	// How many Strings are created in string constant pool : 2
	public static void main(String[] args) {
		
		String name = "Mangesh";
		name = name.toUpperCase();
		System.out.println(name);
		System.out.println(name.length());
	}
}
