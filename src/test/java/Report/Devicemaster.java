package Report;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.java.Login;
import Base.java.baseLoginTest;

public class Devicemaster extends baseLoginTest {
	@Test
	
	public void getDevicemaster()
	{
	 Login loginPage = new Login(driver);
     loginPage.loginTest("Admin", "Admin@123$");

     
     
     WebElement Report = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_Reportmenu")));
     Report .click();
    
     WebElement devicemaster = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liDeviceMReport")));
     devicemaster.click(); 
    
     WebElement dropdownElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
     /*Select  dropdown = new Select(dropdownElem);
	 dropdown.selectByIndex(2);*/
	 
    	/*	Select dropdown = new Select(dropdownElem);
    		int optsCount = dropdown.getOptions().size();
    		for (int i = 0; i < optsCount; i++)
    		{
    		   
    		    dropdownElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
    		    dropdown = new Select(dropdownElem);
    		    dropdown.selectByIndex(i);
	   
      }*/
    
	 WebElement branchname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
     //Select  dropdownbranchname  = new Select(branchname );
    // dropdownbranchname.selectByIndex(2); 
	 
	 /*Select  dropdownbranchname  = new Select(branchname );
	 int dropdownbranchnames= dropdownbranchname.getOptions().size();
	for(int i =0;i<dropdownbranchnames;i++)
	{
		
		 branchname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
		    dropdownbranchname = new Select(branchname);
		    dropdownbranchname.selectByIndex(i);	
	}*/
	 
	 
	 WebElement devicename = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbDeviceSNo")));
     Select dropdowndevicename = new Select(devicename);
     dropdowndevicename.selectByIndex(1);
     
     
     /*int alldevicename =dropdowndevicename.getOptions().size();
     for(int i=0;i<alldevicename;i++)
     {
        devicename = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbDeviceSNo")));
          dropdowndevicename = new Select(devicename);
          dropdowndevicename.selectByIndex(i);
    	 
    	  }*/
	 
	 
     WebElement reportbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_btnReport")));
     reportbtn.click();
   
     
	 
	 
	

}

	
}