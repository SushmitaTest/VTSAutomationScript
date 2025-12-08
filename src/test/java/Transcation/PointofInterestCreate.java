package transcation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class PointofInterestCreate extends baseLoginTest
{
@Test	
public void InterestCreate() throws InterruptedException
{
	Login loginPage = new Login(driver);
    loginPage.loginTest("Admin", "Admin@123$");
    Thread.sleep(2000);
    
    wait =new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement transmod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Transaction']")));
	transmod.click();
      WebElement geofence = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Geofence Create']")));
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView({ block: 'center' });",geofence);
    
   
	WebElement interest = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='ctl00_liVTSPOICreate']")));
	 interest.click();

	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Vname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='VendorNameSelect']")));
		Vname.click(); 
		/* Select sl =new Select(Vname);
	 sl.selectByIndex(4);*/
	 
	 //sl.selectByVisibleText("Mtech Mumbai");
	    Thread.sleep(2000);
	 WebElement Bname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='BranchNameSelect']")));
	    Bname.click();   
	    /* Select ddBname =new Select(Bname);
	    ddBname.selectByIndex(4);
	    Bname.click();   */
	    WebElement POInumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='3']")));
	    POInumber.sendKeys("Punepimplegurav"); //change this value
	
	    Thread.sleep(2000);
	    WebElement POIType= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//Select[@tabindex='4']")));
	   POIType.click();
	  Select ddPOIType =new Select(POIType);
	    ddPOIType.selectByIndex(1); 
	    
	    POIType.click(); 
	    
	    Thread.sleep(2000);
	    WebElement 	Descriptions= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='5']")));
	    Descriptions.sendKeys("pune");
	    WebElement 	Tolerance= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtTolerance']")));
	    Tolerance.sendKeys("20");
	    
	    
	    WebElement 	SelectVeh= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//Select[@tabindex='7']")));
	    SelectVeh.click();	
	    Select ddvehicle =new Select(SelectVeh);
	    ddvehicle.selectByIndex(4);
	    Thread.sleep(2000);
	    WebElement 	showPoi= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='8']")));    
	    showPoi.click();
	        
	    WebElement 	search= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pac-input']")));    
	    search.sendKeys("pune");
	    Thread.sleep(3000);
	    
	    WebElement 	savebtn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@tabindex='10']")));    
	    savebtn.click();
	    Thread.sleep(2000);
	    WebElement 	acttext= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ctl00_ContentPlaceHolder2_lblMsg']")));   
	   String acmesg =acttext.getText().trim();
	   System.out.println(acmesg);
	    
	    String exp ="Record Save Successfully ..!!";
	    Assert.assertTrue(acmesg.equals(exp));
	    
	    
	    
	    
	 
	    
    

	    
	    
}
	
	
	
}//class
