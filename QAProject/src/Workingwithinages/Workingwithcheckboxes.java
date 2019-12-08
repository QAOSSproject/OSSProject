package Workingwithinages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Workingwithcheckboxes {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.spicejet.com/");
		

WebElement	Student=driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
	
		Student.click();
		
		if(Student.isSelected()){
			System.out.println("Student checkbox Active");
		}
		else{
			System.out.println("Student checkbox InActive");
		}
		
		driver.close();
		
		
		
		
	
	
	}
}
