package ex_10_For_Loop;

public class Lab112_For_loop_Continue {

	public static void main(String[] args) {
		
		for(int i = 0; i<50;i++) {
			
			if(i == 5) {	// skip the code and move to next to top
				continue;
			}else {
				System.out.println(i);
			}
		}
	}
}
