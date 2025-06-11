package ex_02_Java_Basics;

public class Lab024_printF {

	public static void main(String[] args) {
		
		// println() vs printf() vs print()
		/*
		print - print the output but no new line
		println - new line added
		printf - format the output
		*/
		
		int a = 10;
		System.out.print("print command print without new line");
		System.out.println("hello world");
		System.out.println("Add new line in the end");
		
		System.out.println(a);
		System.out.printf("Your variable name is %d",a);
		
		 // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
		
        int b = 20;
        System.out.println( " --- ");
        System.out.printf("%d x %d",a,b);
        System.out.println();
        System.out.printf("%d + %d",a,b);
	}

}
