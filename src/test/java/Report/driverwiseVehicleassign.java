package report;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class  DriverWiseVehicleAssign extends baseLoginTest{  
@Test
 public void vehicleExpiry() throws InterruptedException

		{
		 Login loginPage = new Login(driver);
	     loginPage.loginTest("Admin", "Admin@123$");
	     Thread.sleep(1000);
	     WebElement Report = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_Reportmenu")));
	     Report.click();
	     Thread.sleep(1000);
	     WebElement scroll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liVehicleOverSpeedR")));
	JavascriptExecutor scrollup =(JavascriptExecutor)driver;
	scrollup.executeScript("arguments[0].scrollIntoView({block:'center' });",scroll);	
	  Thread.sleep(1000);
	 WebElement vehicleassignReport = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liVehicleAssignDriverwiseR")));
	 vehicleassignReport.click();
	 WebElement customername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
	 /*  Select dropdowncustomername = new Select(customername);
     int dropdowncName =dropdowncustomername.getOptions(). size();
     for(int i=0; i<dropdownvName;i++)
     {
   	  
    	 customername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
  	  dropdowncustomername = new Select(customername);
  	  dropdowncustomername.selectByIndex(i);
  	   }*/
	  Thread.sleep(1000);
   WebElement BranchName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
/* Select dropdownBranchName = new Select(BranchName);
 int dropdownbName = dropdownBranchName.getOptions().size();
  for(int i=0; i<dropdownbName;i++)
  {
	  
 	  BranchName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
 	   dropdownBranchName = new Select(BranchName);
 	     dropdownBranchName.selectByIndex(i);
 }*/
    	
	
   Thread.sleep(1000);
	 WebElement vehiclenumber= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbVehicleName")));
     Select dropdownvehiclenumber = new Select(vehiclenumber );
     Thread.sleep(1000);
    int dropdownvehiclenumbers  =dropdownvehiclenumber.getOptions().size();
     for(int i=0;i<dropdownvehiclenumbers ;i++)
     {

    	 vehiclenumber= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbVehicleName")));
          dropdownvehiclenumber = new Select(vehiclenumber );
          dropdownvehiclenumber.selectByIndex(i);
        
    	 
    	  }
     Thread.sleep(1000);

     WebElement reporbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_btnReport")));
     reporbtn.click();

   
	
	
	

}
}
