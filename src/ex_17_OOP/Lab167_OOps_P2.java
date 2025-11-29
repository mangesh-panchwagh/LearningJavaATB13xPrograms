package ex_17_OOP;

public class Lab167_OOps_P2 {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2;			// Reference creation
        new Student();		// Object creation
	}
}

class Student {
	String name;

	// is called as the default constructor, same name as the class name.
	Student() {
		System.out.println("DC");
	}

	void sleep() {
		System.out.println("Hi");
	}

}