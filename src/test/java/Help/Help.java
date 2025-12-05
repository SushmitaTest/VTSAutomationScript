package Help;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class Help extends  baseLoginTest {
	
	@Test
public void help() throws InterruptedException{
	
	

	Login loginPage = new Login(driver);
	loginPage.loginTest("Admin","Admin@123$");
	Thread.sleep(3000);

	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement help = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Help']")));
	help.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
