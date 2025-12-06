package report;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class LoginAuditHistoryReport extends baseLoginTest {
@Test	
	public void LoginAudit() throws InterruptedException, IOException
	{
	Login loginPage = new Login(driver);
    loginPage.loginTest("Admin","Admin@123$");
    Thread.sleep(3000);
    
    WebElement Report = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='ctl00_Reportmenu']")));
    Report.click();
	Thread.sleep(3000);
    WebElement scrollup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liVehicleStatusReport")));
    JavascriptExecutor scroll =(JavascriptExecutor)driver;
    scroll.executeScript("arguments[0].scrollIntoView({block:'center'});",scrollup);
	
	Thread.sleep(3000);
	WebElement LoginAudit = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_liVTSLoginAuditHistoryReport")));
	LoginAudit.click();
	
	Thread.sleep(3000);

	WebElement vendorname = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
    /* vendorname.click();
	Select dropdown = new Select(vendorname);
	dropdown.selectByIndex(2);*/
	
	
	Thread.sleep(3000);
	WebElement Branchname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='2']")));
	 /*  Branchname.click();
 	Select ddBname =new Select(Branchname);
 	ddBname.selectByIndex(1);*/
	
	
Thread.sleep(3000);
	/*WebElement Username= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbUserName")));
	 Username.click();
 	Select ddUsername =new Select(Username);
 	ddUsername.selectByIndex(1);*/
	
		WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement datePickerS = wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtStartDate']")));
	datePickerS.sendKeys("03/12/2025");

Thread.sleep(3000); 
	WebElement timeInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='time'])[1]")));
	timeInput.clear();
	timeInput.sendKeys("00:11:am"); 

Thread.sleep(3000);
	WebElement datePickerS2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtendDate']")));
	Thread.sleep(3000);
	JavascriptExecutor datepicker2=(JavascriptExecutor)driver;
	datepicker2.executeScript("arguments[0].value='06/12/2025';",datePickerS2);

		Thread.sleep(3000);
	WebElement timeout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='time'])[2]")));
	timeout.clear();
	Thread.sleep(3000);
	timeout.sendKeys("15:01:pm");

	Thread.sleep(3000);
	WebElement reportbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_btnReport")));
	reportbtn.click();
	Thread.sleep(3000);

			 

			
	

	
}	
	
}
