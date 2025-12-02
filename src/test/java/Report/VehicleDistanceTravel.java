package report;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class VehicleDistanceTravel extends baseLoginTest
{
	
	@Test
	public void vehicleDistanceTrvaels() throws InterruptedException
	{
	     Login loginPage = new Login(driver);
	     loginPage.loginTest("Admin", "Admin@123$");
	     
	     Thread.sleep(3000);
	     WebElement Report = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='ctl00_Reportmenu']")));
	     Report.click();
	     
	     WebElement scrollup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liVehicleDatewiseHistroyR")));
	     JavascriptExecutor scroll =(JavascriptExecutor)driver;
	     scroll.executeScript("arguments[0].scrollIntoView({block:'center'});",scrollup);
		
	     WebElement vehicleDistance = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liVehicleDistanceR")));
	     vehicleDistance.click();
	
	     WebElement VendorName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
	    /*  Select dropdownVendorName = new Select(VendorName);
	     int dropdownbName = dropdownVendorName.getOptions().size();
	       for(int i=0; i<dropdownbName;i++)
	      {
	       	Thread.sleep(1000);
	        VendorName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
	       	dropdownVendorName = new Select(VendorName);
	       	dropdownVendorName .selectByIndex(i);
	       	
	       }*/
	     Thread.sleep(1000);
	      WebElement branchname =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
	   /*   Select ddownbranchname  =new Select(branchname);
	     int ddownbranchname1 =ddownbranchname.getOptions().size();
	      
	     for(int i=0;i<ddownbranchname1;i++)
	     {
	    	 Thread.sleep(2000);
	    	 branchname =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
	    	 ddownbranchname =new Select(branchname);
		     ddownbranchname.selectByIndex(i);
	    	 
	    	 
	     }*/
	     
	     
	       WebElement vehicleNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbVehicleName")));
	      Select ddvehicleNumber =new  Select(vehicleNumber);
	       int ddvehicleNumberS=ddvehicleNumber.getOptions().size();
	       for(int i=0;i<ddvehicleNumberS;i++)
	       {
	       	Thread.sleep(1000);
	        vehicleNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbVehicleName")));
	        ddvehicleNumber =new  Select(vehicleNumber);
	        ddvehicleNumber.selectByIndex(i) ;
	       	
	       	
	       }
	       Thread.sleep(1000);
	       WebElement datepicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_txtStartDate")));
	       datepicker.click();
	       datepicker.clear();
	       datepicker.sendKeys("01/12/2025");
	       
	       Thread.sleep(1000);
	       WebElement datepickerTo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_txtendDate")));
	       datepickerTo.click();
	       datepickerTo.clear();
	       datepickerTo.sendKeys("01/12/2025");
	       
	       
	       WebElement reportbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_btnReport")));
	       reportbtn.click();
	  
	      
	      
	      
	       
	     
	     
	     
	     
	     
	       
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	

}
