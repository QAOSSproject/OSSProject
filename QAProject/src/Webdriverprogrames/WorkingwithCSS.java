package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class WorkingwithCSS {

	public static void main(String[] args) {

		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com/");
		
driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("Admin");	
driver.findElement(By.cssSelector("input[name='password']")).sendKeys("mercury");
driver.findElement(By.cssSelector("input[name='login']")).click();
		
		
		
		
		
		
	}

}
