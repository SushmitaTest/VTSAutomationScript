package adminProfile;

import java.util.concurrent.locks.Condition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class MyProfile extends baseLoginTest {
	@Test
	public void myprofile() throws InterruptedException
	{
		Login loginPage = new Login(driver);
		loginPage.loginTest("Admin","Admin@123$");
		Thread.sleep(3000);

	WebElement profile= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[@class='caret']")));
	profile.click();
	
	WebElement profileicon =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='entypo-user']")));
	profileicon.click();
	Thread.sleep(3000);
	WebElement scroll =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnClose']")));
	JavascriptExecutor scrollup =(JavascriptExecutor) driver;
	scrollup.executeScript("arguments[0].scrollIntoView({block:'center'});",scroll);
	
	Thread.sleep(1000);	
	scroll.click();
	

		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
