package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class MailConfigurationSetting extends baseLoginTest{
//as per discussion of developer cannot  be add new data
	@Test
	public void mailconfig() throws InterruptedException
	{
	
	 Login loginPage = new Login(driver);
     loginPage.loginTest("Admin", "Admin@123$");
     Thread.sleep(3000);
     WebElement utility = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Utility']")));
     utility.click();
		Thread.sleep(3000);

   
		  WebElement mailconfig = driver.findElement(By.xpath("//span[text()='Mail Configuration Setting']"));
		  mailconfig.click();
		  
		  
 
		
		
	
		
     
	}
	
	
	
	
	
	
	
}
