package report;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class VehicleReport extends baseLoginTest{
	
@Test
	public void VehicleReport() throws InterruptedException

	{
	 Login loginPage = new Login(driver);
     loginPage.loginTest("Admin", "Admin@123$");
     Thread.sleep(1000);
     WebElement Report = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_Reportmenu")));
     Report .click();
    
     WebElement scroll1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liVehicleDatewiseHistroyRSummary")));
     JavascriptExecutor scroll=(JavascriptExecutor)driver;
     Thread.sleep(1000);
     scroll.executeScript("arguments[0].scrollIntoView({block:'center'});",scroll1);
     WebElement vehicleReport = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liVehicleMasterR")));
     vehicleReport.click();
     
     WebElement vendoreName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
  /*Select dropdownvendoreName = new Select(vendoreName);
  int dropdownvName =dropdownvendoreName.getOptions(). size();
  for(int i=0; i<dropdownvName;i++)
  {
	  
	      vendoreName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
	      dropdownvendoreName = new Select(vendoreName);
	      dropdownvendoreName.selectByIndex(i);
  }*/
   
     WebElement BranchName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
  /*   Select dropdownBranchName = new Select(BranchName);
     int dropdownvName =dropdownBranchName.getOptions(). size();
     for(int i=0; i<dropdownvName;i++)
     {
   	  
    	  BranchName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
    	   dropdownBranchName = new Select(BranchName);
    	     dropdownBranchName.selectByIndex(i);
    }*/
       
	
    WebElement vendorname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
   /* Select dropdownvendorname = new Select(vendorname);
     int dropdownvname =dropdownvendorname.getOptions().size();
     Thread.sleep(1000);
     for(int i=0; i<dropdownvname ;i++)
     {
   	   vendorname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbVehicleName")));
    	    dropdownvendorname = new Select(vendorname);
    	    Thread.sleep(1000);
    	    dropdownvendorname.selectByIndex(i);
  	}*/
	
Thread.sleep(1000);
    WebElement reportbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_btnReport")));
    reportbtn.click();

    
    
    
}


}
