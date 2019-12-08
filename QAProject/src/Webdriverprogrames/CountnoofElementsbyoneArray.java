package Webdriverprogrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class CountnoofElementsbyoneArray {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.cleartrip.com/flights");
		
		//count no of links
		
List<WebElement>Elements=driver.findElements(By.tagName("a"));
System.out.println("no of links are"+"  "+Elements.size());

   //count no of Images

Elements=driver.findElements(By.tagName("img"));
System.out.println("no of images are"+"   "+Elements.size());

//count no of Dropdowns

Elements=driver.findElements(By.tagName("select"));
System.out.println("no of Drodpowns are"+"  "+Elements.size());

//count no of radio
Elements=driver.findElements(By.xpath("//input[@type='radio']"));
System.out.println("no of radios are"+"  "+Elements.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
