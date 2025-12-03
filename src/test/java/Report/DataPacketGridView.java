package report;
	
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

	public class DataPacketGridView extends baseLoginTest {
	
		@Test
		public void framepacker() throws InterruptedException
		{
			
			
			Login loginPage = new Login(driver);
		    loginPage.loginTest("Admin", "Admin@123$");
		    Thread.sleep(3000);
		    
		    WebElement Report = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='ctl00_Reportmenu']")));
		    Report.click();
		    WebElement scrollup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liVehicleStatusReport")));
		    JavascriptExecutor scroll =(JavascriptExecutor)driver;
		    scroll.executeScript("arguments[0].scrollIntoView({block:'center'});",scrollup);
			
			Thread.sleep(3000);
    		WebElement reportdata = driver.findElement(By.xpath("//li[@id='ctl00_Reportmenu']"));
    		 reportdata.click();
    		
    		Thread.sleep(3000);
    			WebElement vendorname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlVendorName']")));
    			/*vendorname.click();
    			Select dropdown = new Select(vendorname);
    			dropdown.selectByIndex(2);*/
    			Thread.sleep(3000);
   
    			WebElement Branchnamename = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='2']")));
    		 	/*Branchnamename .click();
    		 	Select ddBname =new Select(Branchnamename );
    		 	ddBname.selectByIndex(1);*/
    		 	
    			WebElement Vehiclenumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='3'] ")));
    			Vehiclenumber.click();
    			Thread.sleep(1000);
    			Select dropdownvehicles = new Select(Vehiclenumber);
    			dropdownvehicles .selectByIndex(7);

 
    	 	Thread.sleep(3000); 
    	 	WebElement framePackets = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbFramePacketOption")));
             framePackets.click();

    		Select dropdownFpackets = new Select(framePackets);
    		dropdownFpackets.selectByIndex(1);

    	
    		WebElement datePicker1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtStartDate']")));
    		datePicker1.clear();
    		WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(30));
    		WebElement datePickerS = wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtStartDate']")));
    		datePickerS.sendKeys("02/12/2025");
    		
    		Thread.sleep(3000);
    		WebElement timeInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='time'])[1]")));
    		timeInput.clear();
    		timeInput.sendKeys("00:11"); 
    
    		Thread.sleep(3000);
    		WebElement datePickerS2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtendDate']")));
    		Thread.sleep(3000);
    		JavascriptExecutor datepicker2=(JavascriptExecutor)driver;
    		datepicker2.executeScript("arguments[0].value='02/12/2025';",datePickerS2);
    
    		Thread.sleep(3000);
    		WebElement timeout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='time'])[2]")));
    		timeout.clear();
    		Thread.sleep(3000);
    		timeout.sendKeys("10:01");

    		Thread.sleep(3000);
    		WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(30));
    		WebElement rbtn = wait14.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='submit'])[1]")));
    		rbtn.click();
    		Thread.sleep(3000);
   
    		WebElement reportbtn = wait14.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='PDF']")));
    		Thread.sleep(3000);
    		JavascriptExecutor footerscroll=(JavascriptExecutor) driver;
    		 footerscroll.executeScript("arguments[0].scrollIntoView({block:'center'});",reportbtn);
    				 
    		 WebElement export = wait14.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_btnExport")));
    		 export.click();
     		Thread.sleep(3000); 
     		
			/*Thread.sleep(3000);
			WebDriverWait wait15 = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement clrbtn = wait15.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='submit'])[2]")));
			clrbtn.click();

			// -----close btn----------------------------------------
			Thread.sleep(3000);
			WebDriverWait wait16 = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement adminbtn = wait16.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='submit'])[3]")));
			adminbtn.click();*/
		
		
		}//end testcase
		
		
		
	}


