package WorkingwithDropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Tc1Dropdowns {

	public static void main(String[] args) {
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("Sathya");
	
	FirefoxDriver driver=new FirefoxDriver(fp);
	driver.get("http://mercurytravels.co.in");
	
	WebElement Dropdown=driver.findElement(By.id("themes"));
	
  List<WebElement> values=Dropdown.findElements(By.tagName("option"));
  
  System.out.println("no of Values are"+"   "+values.size());
  
  
  for(int i=0;i<values.size();i++){
	  
	  String vname=values.get(i).getText();
	       
	       values.get(i).click();
	       
	       if(values.get(i).isDisplayed()){
	    	   System.out.println(vname+"  "+"Active");
	       }
	       else{
	    	   System.out.println(vname+"  "+"inActive");
	       }
  
	  
  }
    

	    
}








	
		
		


}
