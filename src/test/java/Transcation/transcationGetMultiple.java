package Transcation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class transcationGetMultiple extends baseLoginTest { 
	@Test
	
	public void vtsMultiple() throws InterruptedException
	{
		
		 Login loginPage = new Login(driver);
	     loginPage.loginTest("Admin", "Admin@123$");
	        
	        
		WebElement transmod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Transaction']")));
		transmod.click();
		WebElement getMultiple = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='tooltip-tip  tooltipster-disable'])[3]")));
		getMultiple .click();
		
		
		
		WebElement source = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtSource']")));
		source.sendKeys("nashik phata pune");
		//source.sendKeys(Keys.ENTER);

	WebElement txtDestination = wait
.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtDestination']")));
	txtDestination.click();                 
	txtDestination.sendKeys("hinjwadi pune");
	Thread.sleep(3000);
	

	wait =new WebDriverWait(driver, Duration.ofSeconds(30, 01));
WebElement getRoute = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@tabindex='3']")));
getRoute.click();

/*Actions actions = new Actions(driver);

actions.moveToElement(getRoute).clickAndHold().perform();

Thread.sleep(600 * 1000);
actions.release().perform();*/
	
	
	






	}
	
	

}
