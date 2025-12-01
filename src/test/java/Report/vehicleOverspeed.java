package Report;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.java.Login;
import Base.java.baseLoginTest;

public class vehicleOverspeed extends baseLoginTest{   

	
	@Test
	 public void Overspeed() throws InterruptedException, IOException

		{
	 Login loginPage = new Login(driver);
     loginPage.loginTest("Admin", "Admin@123$");
     
     Thread.sleep(1000);
     WebElement Report = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='ctl00_Reportmenu']")));
     Report.click();
     
     WebElement scrollup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liVehicleDatewiseHistroyR")));
     
        
JavascriptExecutor scroll =(JavascriptExecutor)driver;
scroll.executeScript("arguments[0].scrollIntoView({block:'center'});", scrollup);

WebElement overspeedmodule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liVehicleOverSpeedR")));
overspeedmodule.click();
Thread.sleep(1000);
WebElement VendorName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
/* Select dropdownVendorName = new Select(VendorName);
int dropdownbName = dropdownVendorName.getOptions().size();
for(int i=0; i<dropdownbName;i++)
{
	Thread.sleep(1000);
	dropdownVendorName = new Select(VendorName);
	dropdownbName = dropdownVendorName.getOptions().size();
	dropdownVendorName .selectByIndex(i);
}*/	

WebElement BranchName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
 /*Select dropdownBranchName = new Select(BranchName);
int dropdownbName = dropdownBranchName.getOptions().size();
for(int i=0; i<dropdownbName;i++)
{
	Thread.sleep(1000);
  BranchName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
   dropdownBranchName = new Select(BranchName);
     dropdownBranchName.selectByIndex(i);
}*/
		
WebElement vehicleNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbVehicleName")));
/*Select ddvehicleNumber =new  Select(vehicleNumber);
int ddvehicleNumberS=ddvehicleNumber.getOptions().size();
for(int i=0;i<ddvehicleNumberS;i++)
{
	Thread.sleep(1000);
 vehicleNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbVehicleName")));
 ddvehicleNumber =new  Select(vehicleNumber);
 ddvehicleNumber.selectByIndex(i) ;
	
	
}*/

WebElement datepicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_txtStartDate")));
datepicker.click();
datepicker.clear();
datepicker.sendKeys("29/11/2025");

Thread.sleep(1000);
WebElement datepickerTo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_txtendDate")));
datepickerTo.click();
datepickerTo.clear();
datepickerTo.sendKeys("29/11/2025");

WebElement reportbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_btnReport")));
reportbtn.click();
if (driver != null) {
Thread.sleep(1000);
TakesScreenshot screenshot1 =(TakesScreenshot)driver;
File output =screenshot1.getScreenshotAs(OutputType.FILE);
File dir=new File("D:\\Sushmita.Project_Data\\1TestProjects\\3.vts\\AutomationScriptsData");
File  name =new File(dir,"overspeed.jpg");
FileUtils.copyFile(output, name);

}

	


}
}//class