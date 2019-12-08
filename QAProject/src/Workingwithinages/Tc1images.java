package Workingwithinages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Tc1images {

	public static void main(String[] args) {

		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.flipkart.com/");
		
		Sleeper.sleepTightInSeconds(5);
		
	driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[2]/div[2]/div/a/div/img")).click();
	
	String Actual=driver.getTitle();
	String Expected="Buy";
	
if(Actual.contains(Expected)){
	System.out.println("pass");
}
else{
	System.out.println("fail");
}
	
	
	
	
	
	
	
	
	
	
		
				
		
		
		
		
		
		
	}

}
