package Webdriverprogrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Workingwithradios {

	public static void main(String[] args) {

	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("OnlineQA");
	FirefoxDriver driver=new FirefoxDriver(fp);
	driver.get("http://www.mercurytravels.co.in");
	
	Sleeper.sleepTightInSeconds(5);
	
	
	driver.findElement(By.linkText("Flights")).click();
	
	Sleeper.sleepTightInSeconds(5);
 
	driver.findElement(By.xpath("//*[@id='left-search']/div[1]/div/label[2]/input")).click();
	
	WebElement dor=driver.findElement(By.id("dpf2"));
	
	if(dor.isEnabled()){
		System.out.println("pass");
	}
	else{
		System.out.println("fail");
	}

	
	
	
	
	
	
	}
		
		
	}


