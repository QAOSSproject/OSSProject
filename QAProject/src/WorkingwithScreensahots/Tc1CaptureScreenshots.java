package WorkingwithScreensahots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
public class Tc1CaptureScreenshots {

	public static void main(String[] args) throws IOException  {
			   
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.daytodaygk.com/top-10-information-technology-it-companies-in-india/");

List<WebElement>BKFS=driver.findElements(By.linkText("BKFS"));

if(BKFS.size()==0){
	
File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcfile,new File("C:\\Users\\LENOVO\\Desktop\\sk\\proof.png"));
	
}
else{
	BKFS.get(0).click();
}

















		
		
		
	}

}
