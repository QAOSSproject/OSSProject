package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	public static void main(String[] args) throws InterruptedException {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");

WebDriverWait wait=new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Gmail")));
	
driver.findElement(By.linkText("Gmail")).click();

wait.until(ExpectedConditions.presenceOfElementLocated(By.id("name=Email")));


		
		
		
		
		
		
		
		
		
		

	}

}
