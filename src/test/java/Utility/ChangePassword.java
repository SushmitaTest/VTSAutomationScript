package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class ChangePassword extends baseLoginTest { 
	@Test
	public void Password() throws InterruptedException
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
			
    WebElement  textmsg= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ctl00_ContentPlaceHolder2_lblMsg']")));
    String ActualMessge=textmsg.getText().trim(); 
    System.out.println(" act message is:"   +ActualMessge);
   String expeMess="New Password and Old password same not allow..!";
   System.out.println(" expt message is:"   +expeMess);
   Assert.assertTrue(ActualMessge.equalsIgnoreCase(expeMess));
    
    
   
 
       
       
       
       
       
       
       
	
	
	}
	

}
