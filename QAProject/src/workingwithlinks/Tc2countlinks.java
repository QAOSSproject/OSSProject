package workingwithlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
public class Tc2countlinks {

	public static void main(String[] args) {

		  ProfilesIni pr=new ProfilesIni();
		  FirefoxProfile fp=pr.getProfile("OnlineQA");
		  
		  FirefoxDriver driver=new FirefoxDriver(fp);
		  driver.get("https://www.mercurytravels.co.in/");
		  
		  
		  
	List<WebElement>links=driver.findElements(By.tagName("a"))	 ;
	
	System.out.println("no of links are"+"   "+links.size());
	
	for (int i=0;i<links.size();i++){
		System.out.println(links.get(i).getText());
	}
	
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	
		  
	}

}
