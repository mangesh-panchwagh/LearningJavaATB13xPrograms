package ex_20_OOPs_Polymorphism.methodoveridding;

public class Lab190_Methodoverrding_Automation {

	public static void main(String[] args) {
		
		chromeTC c1 = new chromeTC();
		c1.openBrowser();
		
		firefoxTC f1 = new firefoxTC();
		f1.openBrowser();
		
		CommonToAll commonToAll = new CommonToAll();
		commonToAll.openBrowser();
		
		// Dynamic Dispatch
		CommonToAll  c2 = new chromeTC();
		c2.openBrowser();
		
		CommonToAll  c3 = new firefoxTC();
		c3.openBrowser();
		
		//Firefox ff = new ChromeTC(); Not relation
	}
}

class CommonToAll {
	
	void openBrowser() {
		System.out.println("Starting IE Browser!!");
	}
}

class chromeTC extends CommonToAll{
	
	void openBrowser() {
		System.out.println("Starting chrome browser!!");
	}
}

class firefoxTC extends CommonToAll{
	
	void openBrowser() {
		System.out.println("Firefox will start!!");
	}
}