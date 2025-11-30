package ex_30_Exceptions;

import java.util.Scanner;

public class Lab228_TryCatch_Finally_Purpose {

	public static void main(String[] args) {
        Scanner scan = null;
        scan = new Scanner(System.in);
        System.out.println("Enter the v");
        int v = scan.nextInt();
        try {
            int b= 10/v;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            scan.close();
            System.out.println("end of program , sc closed!");
        }

    }
}
