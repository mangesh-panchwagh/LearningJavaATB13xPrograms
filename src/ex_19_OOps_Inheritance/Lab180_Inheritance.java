package ex_19_OOps_Inheritance;

public class Lab180_Inheritance {

	public static void main(String[] args) {
		
		Father f1 = new Father();
		System.out.println(f1.gold_f);
		f1.bhk2();
		
		Son s = new Son();
		System.out.println(s.gold_f);
		s.bhk2();
		s.bhk3();
	}
}
class Father {
	
	int gold_f = 1000; 	// Attribute | Data variables |  Property | Instance Variables
	
	void bhk2() {       //  Behaviour |  Method | Function | Data members
		 System.out.println("Father - 2BHK");
	}
}

class Son extends Father {
	
//  int gold_f = 1000; // Attribute | Data variables |  Property | Instance Variables
//
//  void bhk2() { //  Behaviour |  Method | Function | Data members
//      System.out.println("Father - 2BHK");
//  }
	
	void bhk3() {
        System.out.println("3BHK Son");
    }
}