package report;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class AlertGridView extends baseLoginTest {
	@Test
	public void AlertGridView () throws InterruptedException, IOException
	{
	Login loginPage = new Login(driver);
    loginPage.loginTest("Admin","Admin@123$");
    Thread.sleep(3000);
    WebElement Report = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='ctl00_Reportmenu']")));
    Report.click();

	    WebElement scrollup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liVehicleStatusReport")));
	    JavascriptExecutor scroll =(JavascriptExecutor)driver;
	    scroll.executeScript("arguments[0].scrollIntoView({block:'center'});",scrollup);
    
	    Thread.sleep(3000);
		WebElement alert= wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_liVTSAlertGridViewReport")));
		alert.click();
		
		Thread.sleep(3000);
	
		WebElement vendorname = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
	 /* vendorname.click();
		Select dropdown = new Select(vendorname);
		dropdown.selectByIndex(2);*/
		
		Thread.sleep(3000);
		WebElement Branchname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='2']")));
		 Branchname.click();
	 	Select ddBname =new Select(Branchname);
	 	ddBname.selectByIndex(1);
	 	 Branchname.click();
	 	Thread.sleep(3000);
	 	WebElement vehicleNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbVehicleName")));
	 	vehicleNumber.click();
	 	/* Select dropdownvNumber =new Select(vehicleNumber);
	 	 Thread.sleep(1000);
	 	  int ddnvNumber =dropdownvNumber.getOptions().size();  
	 	   for( int i=0;i<ddnvNumber ;i++)
	 	   {
	 		   Thread.sleep(1000);
	 		  vehicleNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbVehicleName")));
	 		  dropdownvNumber =new Select(vehicleNumber);
	 		  dropdownvNumber.selectByIndex(i);
	 		   
	 		   
	 	   }*/
	 	Thread.sleep(3000); 
		WebElement timeInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='time'])[1]")));
		timeInput.clear();
		timeInput.sendKeys("00:11"); 

	Thread.sleep(3000);
		WebElement datePickerS2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtendDate']")));
		Thread.sleep(3000);
		JavascriptExecutor datepicker2=(JavascriptExecutor)driver;
		datepicker2.executeScript("arguments[0].value='04/12/2025';",datePickerS2);

			Thread.sleep(3000);
		WebElement timeout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='time'])[2]")));
		timeout.clear();
		Thread.sleep(3000);
		timeout.sendKeys("15:01");

		Thread.sleep(3000);
		WebElement reportbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_btnReport")));
		reportbtn.click();
		Thread.sleep(3000);
	 	
		 WebElement export = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_btnExport")));
		 export.click();
 		Thread.sleep(3000); 
    	
    	
    }
	
	
	
	
	
	
	}
	


