package ex_03_Literals;

public class Lab028_Final_Example {

	public static void main(String[] args) {
		// without assiging it you try to use it, it will throw error (initialize variable local)
		int local = 0;
		System.out.println(local);
		
		final float PI = 3.14f;
		// PI = 3.13f; This is final in nature
		System.out.println(PI);
		
	}
}
