package Transcation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Base.java.Login;
import Base.java.baseLoginTest;

public class transcationRouteDefine extends baseLoginTest {
	
	@Test
	public void getRout() throws InterruptedException
	{
	
	Login loginPage = new Login(driver);
      loginPage.loginTest("Admin", "Admin@123$"); 
      
	WebElement transmod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Transaction']")));
	transmod.click();
	WebElement getMultiple = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='VTS Route Define']")));
	getMultiple .click();
	
	}
	
	 @Test
	
	    public void routeAdd() throws InterruptedException {
	        TranscationRouteDefines routePage = new TranscationRouteDefines(driver, wait);

	        // Use your page object method
	        routePage.routeAdd(
	            "New route",
	            "Hinjewadi, Pune, Maharashtra, India",
	            "Some AddPoint",     // this seems unclear: if you have a "add point" locator, pass the text
	            "Kalewadi Phata",
	            "Swargate"
	        );
	
	//----------------------------------
	/*WebElement Rname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='trip_title']")));
	Rname.sendKeys("New route");
	
	WebElement StartLoc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtStartLocation']")));
	StartLoc.sendKeys("Hinjewadi, Pune, Maharashtra, India");
	StartLoc.click();
	
	
	
	WebElement addpot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='addInputField']")));
	addpot.click();
	
	WebElement waypoint = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search Waypoint Location']")));
	waypoint.sendKeys("kalewadi phata");
	WebElement desLoc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtDestinationLocation']")));
	desLoc.sendKeys("Swargate");
	
	Thread.sleep(1000);
	StartLoc.click();
	StartLoc.sendKeys(Keys.ENTER);
	
	
	if(StartLoc.isSelected())
		
	{
		Thread.sleep(8000);
		
		
	}
	StartLoc.click(); */
	WebElement saveroute = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnRouteNoSave']")));
	saveroute.click();
	
	
	
	
	
	
	
	
	}
	
	
	
}
