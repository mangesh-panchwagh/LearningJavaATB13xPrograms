package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {

	public static void main(String[] args) {
		
		 // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the browser, Which you want to start!!");
        String browser = scan.next();
        browser  = browser.toLowerCase();
        
        switch(browser) {
        case "chrome":
        	System.out.println("Starting the chrome");
            System.out.println("........");
            System.out.println("TC1");
            System.out.println("TC2");
            break;
           
        case "firefox":
        	System.out.println("Starting the firefox browser");
            // Further code to start the Firefox
            // Webdriver driver = new Firfox(); // Selenium Code
        	break;
        
        case "edge":
        	System.out.println("Executing the edge code.");
        	break;
        
        default:
        	System.out.println("Invlaid browser provided.");
        	break;
        }
	}
}
