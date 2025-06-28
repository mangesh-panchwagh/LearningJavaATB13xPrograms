package ex_05_Type_Casting;

public class Lab061_TypCasting_Used {

	public static void main(String[] args) {
		
		int course = 1000;
		float GST = 18.45f;
		//int total = course + GST;	// Narrow - iplicit
		int total1 = course + (int) GST;
		System.out.println(total1);
		
		float total2 = course + GST;	// widening - auto - implicit
		float total3 = (float)course + GST; // widening - explicit
		
		System.out.println(total2);
		System.out.println(total3);
	}
}
