package workingwithlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Tc1VerifyGmailtitle {

	public static void main(String[] args) {
		//open browser navigate to page
		
	  ProfilesIni pr=new ProfilesIni();
	  FirefoxProfile fp=pr.getProfile("OnlineQA");
	  
	  FirefoxDriver driver=new FirefoxDriver(fp);
	  driver.get("http://google.com");
	  
	  //Click on Gmail Link
	  driver.findElement(By.linkText("Gmail")).click();
	  
	  //Get title 
	  String Actual=driver.getTitle();
	  String Expected="Gmail";
	  if(Actual.contains(Expected)){
		  System.out.println("TC pass");
	  }
	  else{
		  System.out.println("TC fail");
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
		
	}

}
