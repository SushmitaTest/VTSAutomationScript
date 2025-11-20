package Transcation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.java.Login;
import Base.java.baseLoginTest;

public class transcationDashboard extends baseLoginTest {

	@Test
	public void dashboard()
	{
		Login loginPage = new Login(driver);
	     loginPage.loginTest("Admin", "Admin@123$");

	     wait =new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement transmod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Transaction']")));
			transmod.click();

			WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Dashboard']")));
			dashboard .click();
		
		
		
	}
	
	
}
