package Transcation;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.java.baseLoginTest;


public class transcationVtshistory extends baseLoginTest {
	
	
	@Test(enabled = true)
	public void vtshistory() throws InterruptedException
	{
		
		WebDriverWait wait1 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement transmod =wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Transaction']")));
		transmod.click();
		
		WebDriverWait wait2 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement VTSHistory =wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()= 'VTS History']")));
		VTSHistory.click();

	
		WebDriverWait wait3=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement ddVTSdev =wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='VehicleSelect']")));
		ddVTSdev.click();

		Select sl =new Select(ddVTSdev);
		sl.selectByIndex(11);
		ddVTSdev.click();
	
		
		
		WebDriverWait wait4=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement fdate =wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='dtStartDate']")));
		fdate.clear();
		fdate.sendKeys("13/11/2025");

		
		Thread.sleep(3000);
		WebDriverWait wait5=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement ftime =wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='TmStartTime']")));
		ftime .clear();
		ftime .sendKeys("00:30:AM");
		Thread.sleep(3000);
		WebDriverWait wait6=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement tdate =wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='dtEndDate']")));
		fdate.clear();
		fdate.sendKeys("13/11/2025");

		
		
		Thread.sleep(3000);
		WebDriverWait wait7=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Ttime =wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='TmEndTime']")));
		Ttime .clear();
		Ttime .sendKeys("23:30:PM");
		Thread.sleep(3000);		
		
		
		WebDriverWait wait8=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement VHBTN =wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnVehicleHistory']")));
		VHBTN .click();
		
		Thread.sleep(3000);	
		WebDriverWait wait9=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement  Icnstart =wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Start']")));
		Icnstart.click();
		Thread.sleep(3000);	
		
		Thread.sleep(3000);	
		WebDriverWait wait10=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement  Icnpause = wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Pause']")));
		 Icnpause.click();	
		 Thread.sleep(3000);	
		 Thread.sleep(3000);	
		 WebDriverWait wait11=new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement  Icnstop = wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Stop']")));
			Icnstop.click();		
		
		
		
		
		
		
	}

}



