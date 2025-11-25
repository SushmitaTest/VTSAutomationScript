package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Base.java.Login;
import Base.java.baseLoginTest;

public class UtilityPassword extends baseLoginTest { 
	@Test
	public void getPassword()
	{
	
	   Login loginPage = new Login(driver);
       loginPage.loginTest("Admin", "Admin@123$");

       WebElement utility = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Utility']")));
       utility.click();
       WebElement createUser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Change Password']")));
       createUser.click();
       WebElement  oldpassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='1']")));
       oldpassword.sendKeys("admin@123$");
		
	
       WebElement newpassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='2']")));
       newpassword.sendKeys("admin@123$");
		
	
       /*WebElement  confpassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='3']")));
       confpassword .sendKeys("admin@123$");*/
		
	
    WebElement  btnsave1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='4']")));
    btnsave1 .click();
			
       
       
       
       
       
       
       
       
       
       
	
	
	}
	

}
