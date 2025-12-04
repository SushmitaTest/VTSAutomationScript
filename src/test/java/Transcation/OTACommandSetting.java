package transcation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class OTACommandSetting extends baseLoginTest 
{
@Test
	public void Command() throws InterruptedException
	{
	Login loginPage = new Login(driver);
     loginPage.loginTest("Admin", "Admin@123$");

     wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement transmod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Transaction']")));
		transmod.click();

		WebElement otacommand = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='OTA Command Setting']")));
		otacommand.click();
		

		WebElement vname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='1']")));
		/*vname.click();	
	Select dropdvname =new Select(vname);
		dropdvname.selectByIndex(5);*/
	
Thread.sleep(3000);
		WebElement bname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='2']")));
		/*bname.click();
	Select dropdbname =new Select(bname);
		dropdbname.selectByIndex(1);*/
	
	Thread.sleep(3000);		
		WebElement vnumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='3']")));
		vnumber.click();
			Select dropdbvnumber =new Select(vnumber);
		dropdbvnumber.selectByIndex(5); 

		Thread.sleep(3000);
		WebElement comDescript = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='4']")));
		vnumber.click();
	Select dropdcomDescript =new Select(comDescript);
	dropdcomDescript.selectByIndex(10);		
		

	Thread.sleep(3000);
	WebElement comDescriptType = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='5']")));
	comDescriptType .click();

	Thread.sleep(3000);
Select dropdcomDescriptType  =new Select(comDescriptType );
dropdcomDescriptType .selectByIndex(1);			
		
Thread.sleep(3000);
WebElement sendCommand = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnSendCommand']")));

Thread.sleep(3000);
sendCommand .click();
WebElement Command = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='controls'])[12]")));


String actualMessage = Command.getText().trim();
System.out.println("Actual message: " +actualMessage);


String expectedMessage = "OTA Command Responce found yes";
Assert.assertTrue(actualMessage.equalsIgnoreCase(expectedMessage));


	    


		
			
		
	
	
	}	
	
}
