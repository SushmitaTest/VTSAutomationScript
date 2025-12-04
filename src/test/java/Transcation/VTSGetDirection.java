package transcation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class VTSGetDirection extends baseLoginTest {

	@Test
	public void vtsget() throws InterruptedException {
		
		
		 Login loginPage = new Login(driver);
	      loginPage.loginTest("Admin", "Admin@123$");
	        
		wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement transmod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Transaction']")));
		transmod.click();

		WebElement vtsgetmod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='VTS Get Direction']")));
		vtsgetmod.click();

		WebElement source = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtSource']")));
		source.sendKeys("nashik phata pune");
		//source.sendKeys(Keys.ENTER);

	WebElement txtDestination = wait
.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtDestination']")));
	txtDestination.click();                 
	txtDestination.sendKeys("hinjwadi pune");

	
	wait =new WebDriverWait(driver, Duration.ofSeconds(30, 01));
	WebElement getRoute = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@tabindex='3']")));
	getRoute.click();

	
	
	
	
		
		
	}

}
