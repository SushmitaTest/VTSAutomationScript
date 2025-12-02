package AllModules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;


public class ReportM extends baseLoginTest
{
	@Test
	public void RDataPacketGridView() throws InterruptedException
	{
		 Login loginPage = new Login(driver);
	        loginPage.loginTest("Admin", "Admin@123$");
		//----- open report module----------------------------------------
		Thread.sleep(3000);
		WebElement Report = driver.findElement(By.xpath("//li[@id='ctl00_Reportmenu']"));
		Report.click();
		Thread.sleep(3000);

		// -----open the GridViewReport----------------------------------------
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement report3 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='ctl00_liVTSDataPacketGridViewReport' and @style='text-align: left;']")));
		report3.click();
	 	  
	 	  //-----Company name----------------------------------------
			/*WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement vname = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlVendorName']")));
			vname.click();

			Select dropdown = new Select(vname);
			dropdown.selectByIndex(0);
			Thread.sleep(3000);
			driver.navigate().refresh();*/
	 	 
	 	  //-----Vehicle number----------------------------------------
			WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement Vnumber = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_CmbVehicleName']")));
			Vnumber.click();
			Thread.sleep(3000);
			WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(30));
			Select dropdown = new Select(Vnumber);
			dropdown.selectByIndex(11);
			Thread.sleep(3000);

	 	 //-----Branch name----------------------------------------
	 	/*WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 	WebElement Bname = wait13.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='2']")));
		 	Bname.click();
		 	Select ddBname =new Select(Bname);
		 	ddBname.selectByIndex(0);*/
	 	 
	 	// WebElement Vnumber1= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[text()='OD15SP2061']")));
	 	// Vnumber.click();
	 	WebDriverWait wait6 =new WebDriverWait(driver, Duration.ofSeconds(30));
	 	WebElement Vnumberc= wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_CmbVehicleName']")));
	    Vnumberc.click();
	 	 
	 	Thread.sleep(3000); 
	 	
	 	  
	 /*	WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(30));
	 	WebElement framePackets = wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='Vnumber']/ancestor::div[@class='controls']")));

	 	framePackets.click();*/
	 	//-----framePackets----------------------------------------
		WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement framePackets = wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='4']")));
		framePackets.click();
		Select dropdownFpackets = new Select(framePackets);
		dropdownFpackets.selectByIndex(1);

		// -----Datepicker1----------------------------------------
		WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement datePicker1 = wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtStartDate']")));
		datePicker1.clear();
		WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement datePickerS = wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtStartDate']")));
		datePickerS.sendKeys("03/11/2024");
		datePickerS.sendKeys(Keys.ENTER);

		// -----InTime--------------------------------------------
		Thread.sleep(3000);
		WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement timeInput = wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='time'])[1]")));
		timeInput.clear();
		timeInput.sendKeys("00:11:am");

		// -----Datepicker1----------------------------------------
		WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement datePickerS2 = wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtendDate']")));
		datePickerS2.clear();
		datePickerS2.sendKeys("04/11/2024");
		datePickerS2.sendKeys(Keys.ENTER);

		// -----OutTime------------------------------------------
		Thread.sleep(3000);
		WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement timeout = wait12.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='time'])[2]")));
		timeout.clear();
		timeout.sendKeys("22:01:pm");

		// -----Submit btn----------------------------------------
		Thread.sleep(3000);
		WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement rbtn = wait14.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='submit'])[1]")));
		rbtn.click();
		Thread.sleep(5000);
		// -----clear btn----------------------------------------
		Thread.sleep(3000);
		WebDriverWait wait15 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement clrbtn = wait15.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='submit'])[2]")));
		clrbtn.click();

		// -----close btn----------------------------------------
		Thread.sleep(3000);
		WebDriverWait wait16 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement adminbtn = wait16.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='submit'])[3]")));
		adminbtn.click();
	
	
	}//end testcase
	
	
	
}