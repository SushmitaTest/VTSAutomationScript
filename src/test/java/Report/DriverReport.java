package report;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class DriverReport extends baseLoginTest {
	@Test
	public void driverreport() throws InterruptedException, IOException
	{
	Login loginPage = new Login(driver);
    loginPage.loginTest("Admin", "Admin@123$");
    Thread.sleep(1000);
    
    WebElement Report = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_Reportmenu")));
    Report .click();
   
    WebElement devicemaster = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liDriverMReport")));
    devicemaster.click(); 
  /*  WebElement vendorname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
    Select dropdownvendorname =new Select(vendorname);
    
   int  ddropdownvname =dropdownvendorname.getOptions().size();
    for(int i =0; i<ddropdownvname;i++)
    {
    	
    	vendorname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
    	  dropdownvendorname =new Select(vendorname);
    	  dropdownvendorname.selectByIndex(i);
    	
    }*/
    
 
    WebElement branchname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
   /* Select dropdownbranchname =new Select(branchname);
    
   int dropdownbname = dropdownbranchname.getOptions().size();
    for(int i=0 ;i<dropdownbname;i++)
    {
    	 branchname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
    	 dropdownbranchname =new Select(branchname);
    	 dropdownbranchname.selectByIndex(i);
    	 
    	 
    	
    }*/
    
 WebElement vNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbDriverName")));
/* vNumber.click();
 Select dropdownvNumber =new Select(vNumber);
 Thread.sleep(1000);
  int ddnvNumber =dropdownvNumber.getOptions().size();  
   for( int i=0;i<ddnvNumber ;i++)
   {
	   Thread.sleep(1000);
	 vNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbDriverName")));
	  dropdownvNumber =new Select(vNumber);
	  dropdownvNumber.selectByIndex(i);
	   
	   
   }*/
 Thread.sleep(3000);
 WebElement reportbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_btnReport")));
 reportbtn.click();

    
  Thread.sleep(1000);
  TakesScreenshot screenshot=(TakesScreenshot)driver;
  File dir =new File("D:\\Sushmita.Project_Data\\1TestProjects\\3.vts\\AutomationScriptsData");
  File name1 =new File(dir,"servererror2.jpg");
  
  File screenshot1=screenshot.getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(screenshot1,name1);
  
  
  
  
  
  
  
    
	}
}
