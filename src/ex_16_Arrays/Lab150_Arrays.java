package ex_16_Arrays;

public class Lab150_Arrays {

	public static void main(String[] args) {
		
		int [] marks = {1,2,3,4,5,6};	// First way - Predefined way of creating array
		
		// 2nd way to create the array
		
		int [] marks2 = new int[5];		// Fixed size 5. index 0 to 4
		String[] name = new String[3];	// Fixed size 3. index 0 to 2
		
		name[0] = "Mangesh";
		name[1] = "Pramod";
		name[2] = "Shammi";
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
//		System.out.println(name[]);
	}
}
