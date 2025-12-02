package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class UtilitymailConfig extends baseLoginTest{

	@Test
	public void mailconfig() throws InterruptedException
	{
	
	 Login loginPage = new Login(driver);
     loginPage.loginTest("Admin", "Admin@123$");

     WebElement Report = driver.findElement(By.xpath("//li[@id='ctl00_Reportmenu']"));
		Report.click();
		Thread.sleep(3000);

   
		  WebElement Vname = driver.findElement(By.xpath("//span[text()='Device Master Report']"));
		  Vname.click();
		  
		  
  WebElement Vname1 = driver.findElement(By.xpath("//span[text()='Device Master Report']"));
		  Vname1.click();
		  	  
		
		
		
		
		
		
		
		
     
	}
	
	
	
	
	
	
	
}
