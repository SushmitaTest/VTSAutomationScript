package Transcation;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Base.java.Login;
import Base.java.baseLoginTest;

public class transcationStreetViewsidebyside extends baseLoginTest{

	@Test
	public void showview()
	{
		 Login loginPage = new Login(driver);
	      loginPage.loginTest("Admin", "Admin@123$");
	        
	
	WebElement transmod =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Transaction']")));
	transmod.click();
	
	
	WebElement showview=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@style='display: inline-block; float: none;'])[17]")));
	showview.click();
	
	
	WebElement showviewicon=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='width: 49px; height: 52px; overflow: hidden; position: absolute; top: 50%;']")));
	showviewicon.click();
		
WebElement moveicon=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//gmp-internal-use-am[@position='18.60132655904383,73.73736891611262']")));	
Actions act =new Actions(driver);

	
int moveX = 100;  
int moveY = 180; 

act.clickAndHold(moveicon) .moveByOffset(moveX, moveY) .release() .perform();



	}	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	

