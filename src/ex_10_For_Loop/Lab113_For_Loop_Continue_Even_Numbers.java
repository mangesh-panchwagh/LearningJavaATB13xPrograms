package ex_10_For_Loop;

public class Lab113_For_Loop_Continue_Even_Numbers {

	public static void main(String[] args) {
		
		for(int i = 0; i<=50; i++) {	// 0 to 50, 51 Times
			
			if(i%2 == 0) {
				continue;	// skip the code and move to next to top
			}
			System.out.println("Odd -> " + i);
		}
	}
}
