package transcation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class TransactionRouteDefine extends baseLoginTest {

    @Test
    public void createRouteTest() throws Exception {
        Login loginPage = new Login(driver);
        loginPage.loginTest("Admin", "Admin@123$");
        Thread.sleep(3000);
    
        WebElement transaction = wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Transaction']")));
        transaction.click();
        Thread.sleep(3000);
        WebElement routeDefine = wait.until(
       ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='VTS Route Define']")));
        routeDefine.click();

        Thread.sleep(3000);
        TransactionRouteDefines routePage = new TransactionRouteDefines(driver, wait);
        Thread.sleep(3000);
        routePage.createRoute("New Route","Hinjewadi, Pune, Maharashtra, India",
                "Kalewadi Phata",
                "Pune, Maharashtra, India");
        
        
    }
}


  

	/*----------------------------------elements
	WebElement Rname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='trip_title']")));
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
	StartLoc.click(); 
	  WebElement saveroute = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnRouteNoSave']")));
	  saveroute.click(); */
	
	
	
	
	
	
	
	
	
	
	

