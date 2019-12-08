package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithImages {
	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "location of Driver file");	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.mercurytravels.co.in/");
	
driver.findElement(By.linkText("Flights")).click();

driver.findElement(By.xpath("//*[@id='left-search']/div[1]/div/label[2]/input")).click();
	
		
		
	}

}
