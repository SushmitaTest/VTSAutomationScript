package AllModules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.java.baseLoginTest;

public class MasterVehicle extends baseLoginTest{

	@Test
	public void addVehicle() throws InterruptedException
	{
		
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement mMenu =wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Master Menu']")));		
		mMenu.click();
		
		Thread.sleep(3000);
		WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement drivereadd = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Vehicle Entry Master']")));
		drivereadd.click();
		
		//-----device vendor name ---------------------------------------------
			   /* Thread.sleep(3000);
				WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement vname = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlVendorName']")));
				vname.click();

				Select ddvname = new Select(vname);
				ddvname.selectByIndex(2);

		 //-----Branch name ---------------------------------------------
						Thread.sleep(3000);
						WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
						WebElement Bname = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='2']")));
						Bname.click();
						Select ddBname = new Select(Bname);
						ddBname.selectByIndex(3);*/
						
		Thread.sleep(3000);
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement vno= wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtVehicleNumber']")));
		vno.sendKeys("TE10ST1110");
		
		Thread.sleep(3000);
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement vname = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtVehicleName']")));
		vname.sendKeys("honda city");
		
		Thread.sleep(3000);
		WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement vfuel = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtFuelType']")));
		vfuel.sendKeys("petrol");
	
		Thread.sleep(3000);
		WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement vspeed = wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtSpeedLimit']")));
		vspeed.sendKeys("40");
		
		Thread.sleep(3000);
		WebDriverWait wait8= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement vtype = wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlVehicleType']")));
		vtype.click();
		
	 Select sl =new Select(vtype);
	 sl.selectByIndex(2);
	 
		WebDriverWait wait9= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement dname   = wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlDriverName']")));
		dname .click();
		Select dddrname= new Select(dname);
		dddrname.selectByIndex(20);
		dname .click();
		
		WebDriverWait wait10= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement devnane = wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlDeviceName']")));
		devnane.click();
		Select dddevname= new Select(devnane);
		dddevname.selectByIndex(4);
		devnane.click();

		WebDriverWait wait11= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement odd = wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtCurrentOdometer']")));
		odd.sendKeys("400.00");
	
		WebDriverWait wait12= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement vehval= wait12.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtVehicleValidity']")));
		vehval.sendKeys("01/11/2031");
	 
	 

		WebDriverWait wait13= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement chek= wait13.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
		chek.click();
		WebElement savebtn= wait13.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnSave']")));
		savebtn.click();
		
		WebElement clearbtn= wait13.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ID='ctl00_ContentPlaceHolder2_btnClear']")));
		clearbtn.click();
		Thread.sleep(3000);


	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
				
				
	
	}
	

