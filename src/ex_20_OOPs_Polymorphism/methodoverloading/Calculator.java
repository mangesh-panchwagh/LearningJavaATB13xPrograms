package ex_20_OOPs_Polymorphism.methodoverloading;

public class Calculator {

	public static void main(String[] args) {
		
		Calc c1 = new Calc();
		int a = c1.add(3,4);
		double b = c1.add(3.414, 4.56);
		
		System.out.println(a);
		System.out.println(b);
	}
}

class Calc{
	
	int add(int a, int b) {
		return a + b;
	}
	
	double add(double a, double b) {
		return a + b;
	}
}