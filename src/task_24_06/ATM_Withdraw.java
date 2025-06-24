package task_24_06;

import java.util.Scanner;
// 14) ATM Withdraw Simulation

public class ATM_Withdraw {

	public static void main(String[] args) {
		
		int balance = 10000;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount to withdraw :");
		
		int withdrawAmount = scan.nextInt();
		int remainingBalance = 0;
		
		if((withdrawAmount >=0) && (withdrawAmount <= balance)) {
			
			if(withdrawAmount % 100 == 0) {
				
				remainingBalance = balance - withdrawAmount;
				System.out.println("Withdraw Successful...");
				System.out.println("Remaining Balance : "  + remainingBalance);
			}
		}else {
			System.out.println("Please enter valid amount to withdraw.");
		}
		
		
	}
}
