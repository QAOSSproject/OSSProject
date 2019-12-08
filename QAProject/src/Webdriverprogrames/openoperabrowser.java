package Webdriverprogrames;

import org.openqa.selenium.opera.OperaDriver;

public class openoperabrowser {

	public static void main(String[] args) {

	System.setProperty("webdriver.opera.driver", "C:\\Users\\LENOVO\\Pictures\\Downloads\\operadriver.exe")	;
		
		OperaDriver driver=new OperaDriver();
		driver.get("htpp://google.com");
	}

}
