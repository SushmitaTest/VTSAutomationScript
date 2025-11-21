package Transcation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.java.Login;
import Base.java.baseLoginTest;

public class transcationDashboard extends baseLoginTest {

	@Test
	public void dashboard() throws InterruptedException
	{
		Login loginPage = new Login(driver);
	     loginPage.loginTest("Admin", "Admin@123$");

	     wait =new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement transmod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Transaction']")));
			transmod.click();
			WebElement dashboard1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Dashboard']")));
			JavascriptExecutor jscrooll1 =(JavascriptExecutor)driver;
			jscrooll1.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", dashboard1);
			Thread.sleep(3000);
			WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Dashboard']")));
			dashboard .click();
			
			WebElement footer = driver.findElement(By.xpath("//div[@id='footable-res2_info']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);", footer);
			/*
			
		WebElement running = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ctl00_ContentPlaceHolder2_divRunning_Count']")));
			running.click();
		
			WebElement idle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ctl00_ContentPlaceHolder2_divIdle_Count']")));
			idle.click();	
			
			WebElement stopped = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ctl00_ContentPlaceHolder2_divInactive_Count']")));
			stopped.click();		
			
			WebElement inactive = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ctl00_ContentPlaceHolder2_divStopped_Count']")));
		 inactive .click();		
					

			WebElement nodata = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ctl00_ContentPlaceHolder2_divNoData_Count']")));
			 nodata .click();	
			 

				WebElement overspeed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ctl00_ContentPlaceHolder2_divOverSpeed_Count']")));
				overspeed.click();	
				 			 
				WebElement total = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ctl00_ContentPlaceHolder2_divTotal_Count']")));
				total.click();	
				 			*/
			
			String[]status =
			{
				
					"ctl00_ContentPlaceHolder2_divRunning_Count",
					"ctl00_ContentPlaceHolder2_divIdle_Count",
					"ctl00_ContentPlaceHolder2_divInactive_Count",
				 "ctl00_ContentPlaceHolder2_divStopped_Count",
				"ctl00_ContentPlaceHolder2_divNoData_Count",
				"ctl00_ContentPlaceHolder2_divOverSpeed_Count",
				"ctl00_ContentPlaceHolder2_divTotal_Count",
				
					
			};
			
		for(int i =0 ;i<status.length;i++)
		{
				
		WebElement allstatus = wait.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//div[@id='" + status[i] + "']")));
		allstatus.click();
		wait.until(ExpectedConditions.stalenessOf(allstatus));
			
		Thread.sleep(1000);
		
		
		}//for
			
		
		
		Thread.sleep(3000);
		WebElement nodata = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ctl00_ContentPlaceHolder2_divNoData_Count']")));
		 nodata .click();
		 
		 wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement vehiclelink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@value='866334070739871 NoData']")));
		 vehiclelink .click();
			
	
		 Thread.sleep(3000);
	

		 
				
			

		 
			
				}
				
				
				
			
			
	}//class
	
	

