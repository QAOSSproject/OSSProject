package WorkingwithTextElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Tc1TextElements {

	public static void main(String[] args) {
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com/");
		
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		
driver.findElement(By.name("firstName")).sendKeys("Tester");	
driver.findElement(By.name("lastName")).sendKeys("QA");
driver.findElement(By.name("phone")).sendKeys("100");
driver.findElement(By.id("userName")).sendKeys("ramki.trainer@gmail.com");
driver.findElement(By.name("address1")).sendKeys("Maduranagar");
driver.findElement(By.name("city")).sendKeys("Hyd");
driver.findElement(By.name("state")).sendKeys("TG");
driver.findElement(By.name("postalCode")).sendKeys("108");
driver.findElement(By.name("country")).sendKeys("INDIA");
driver.findElement(By.id("email")).sendKeys("SDET");
driver.findElement(By.name("password")).sendKeys("12345");
driver.findElement(By.name("confirmPassword")).sendKeys("12345");

driver.findElement(By.name("register")).click();



String Actual=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
String Expected="SDET";

if(Actual.contains(Expected)){
	System.out.println("Registration Succ");
}
else{
	System.out.println("Registration Fail");
}
















		
		
	}
}
		
		
	