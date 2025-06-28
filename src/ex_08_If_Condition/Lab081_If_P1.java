package ex_08_If_Condition;

import java.util.Scanner;

public class Lab081_If_P1 {

	public static void main(String[] args) {
		
		System.out.println("Enter Age");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		if(age > 18) {
			System.out.println("Yes you can go to GOA!");
		}else {
			System.out.println("Yes you can not go to GOA!");
		}
	}
}
