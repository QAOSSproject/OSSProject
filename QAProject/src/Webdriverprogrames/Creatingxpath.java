package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Creatingxpath {

	public static void main(String[] args) {
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.rediff.com/");
		
driver.findElement(By.linkText("Create Account")).click();

Sleeper.sleepTightInSeconds(3);

driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("Ramakrishna");
driver.findElement(By.xpath("//input[contains(@name='login')]")).sendKeys("ramki.trainer@reddif.com");		
		
		
		
		
		
	}

}
