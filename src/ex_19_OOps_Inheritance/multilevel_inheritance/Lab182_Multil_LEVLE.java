package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab182_Multil_LEVLE {

	public static void main(String[] args) {
		
		GrandFather gf = new GrandFather();
		gf.gf();
		
		System.out.println(" -- ");
		
		Father  f = new Father();
		f.f();
		f.gf();
		
		System.out.println(" -- ");
		
		Son s = new Son();
		s.s();
		s.f();
		s.gf();
		
	}
}
