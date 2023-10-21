package week1.day2;

public class Browser {
	
	public String launchBrowser(String browserName) {		
		System.out.println("Browser launched succesfully");
		return browserName;
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
				
	}
	public static void main(String[] args) {
	Browser LB = new Browser();
	System.out.println(LB.launchBrowser("chrome"));	
	LB.loadUrl();		 
		
	}
	
	
	}


