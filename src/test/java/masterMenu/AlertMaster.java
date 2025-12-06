package masterMenu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class AlertMaster extends  baseLoginTest  {
	
@Test
public void addAlert() throws InterruptedException
{
	 Login loginPage = new Login(driver);
     loginPage.loginTest("Admin", "Admin@123$");
	
     Thread.sleep(1000);
	WebDriverWait wait51 = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement mMenu = wait51.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Master Menu']")));
	mMenu.click();
	
	
	WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement alert =wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Alert Master']")));
	alert.click();
	
	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement Vname = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlVendorName']")));
	// Vname.click();
	/*Select ddvname =new Select(Vname);
	 	ddvname.selectByIndex(12);
	 	*/
	 
	Thread.sleep(3000);
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Bname = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='2']")));
		//Bname.click();
		/*Select ddBname = new Select(Bname);
		ddBname.selectByIndex(0);*/

		
		WebDriverWait wait7 =new WebDriverWait(driver,Duration.ofSeconds(30));
      	WebElement alertgrpname =wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtAlertGroupName']")));
      	alertgrpname.sendKeys("TestData1");
		
      	WebDriverWait wait5 =new WebDriverWait(driver,Duration.ofSeconds(30));
      	WebElement chek =wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_CheckAllVehicle']")));
      	chek.click();
      	
   	WebDriverWait wait6 =new WebDriverWait(driver,Duration.ofSeconds(30));
   WebElement chek2 =wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_CheckAllAlertType']")));
      	chek2.click();
      	
     
   /*	int  alertType = 13 ;
     for(int i =0;i<=alertType;i++)
    	  
     {
         String nameValue="ctl00$ContentPlaceHolder2$chklistAlertType$" +i ;
    	  WebElement check2 =wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='" +nameValue +"']")));
    	  check2.click();
    	  
      }*/
       	Thread.sleep(2000);
      WebDriverWait wait9 =new WebDriverWait(driver,Duration.ofSeconds(30));
       WebElement savebtn =wait9.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_btnSave")));
       savebtn.click();
   	
        
   /*	int maxIndex = 13;  
   	for(int i = 0; i <= maxIndex; i++) {
   	    String nameValue = "ctl00$ContentPlaceHolder2$chklistAlertType$" + i;
   	    WebElement check2 = wait6.until(
   	        ExpectedConditions.visibilityOfElementLocated(
   	            By.xpath("//input[@name='" + nameValue + "']") )   );
   	    check2.click();
   	}*/

   	
	 


 
      	
      	
      	
      	
      	
      	
	 			
	
}
	
	

}
