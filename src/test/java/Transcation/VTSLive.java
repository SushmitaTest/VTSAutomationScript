package transcation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class VTSLive extends baseLoginTest {

	@Test
	public void cheVLive() throws InterruptedException
	{
		 Login loginPage = new Login(driver);
	        loginPage.loginTest("Admin", "Admin@123$");
	        Thread.sleep(2000);
	WebDriverWait wait1 =new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement transmod =wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Transaction']")));
	transmod.click();
	
	WebDriverWait wait2 =new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement vlive=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='VTS Live']")));
	vlive.click();
	
	
	
	WebDriverWait wait3 =new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement drpdevice=wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='VehicleSelect']")));
  drpdevice.click();
	
  
  Select sl =new Select(drpdevice); 
  sl.selectByIndex(7);
  drpdevice.click();

  
  Thread.sleep(2000);
  
 /* List<WebElement> allop=sl.getAllSelectedOptions(); 
  for(int i=0;i<allop.size();i++) 
  { 
	  sl.selectByIndex(i);
	  
  
  }*/
    
	WebDriverWait wait4 =new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement track=wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='Track_Vehicle']")));
	track.click();
	

  
  
}
}


