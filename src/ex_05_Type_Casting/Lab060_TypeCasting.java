package ex_05_Type_Casting;

public class Lab060_TypeCasting {

	public static void main(String[] args) {
		
		long phone = 9730220048L;
		//short s = phone;	// Implicit narrow
		short s1 = (short)phone;
		System.out.println(s1);
	}
}
