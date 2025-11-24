package Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.java.Login;
import Base.java.baseLoginTest;

public class CreateUser extends baseLoginTest {


@DataProvider(name = "email")
public String[][] getemail() {  
    return new String[][] {
        { "testgmail.com"},
        { "test@gmailcom" },
        { "testgmailcom"},
    };
}

	
@Test( dataProvider = "email")
public void getcreateUser(String emailid) throws InterruptedException
{
	
	Login loginPage = new Login(driver);
    loginPage.loginTest("Admin", "Admin@123$");
    	
	
	WebElement utility =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Utility']")));
	utility.click();
	
	WebElement CreateUser =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create User']")));
	CreateUser.click();
	WebElement vendorName =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlVendorName']")));
	/*vendorName.click();
		Select ddvendorName =new Select(vendorName);
		//ddvendorName.selectByIndex(4);
		 */
	 
	 //sl.selectByVisibleText("Mtech Mumbai");
	 
	 WebElement Bname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlBranchName']")));
	 /* Bname.click(); 
		Select ddBname =new Select(vendorName);
		ddBname.selectByIndex(4);*/
	
	 WebElement Username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtUserName']")));
	 Username.sendKeys("Admin");
	 Thread.sleep(1000);
	 WebElement UserType = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlUserType']")));
	 UserType.click();		
	Select ddUserType = new Select(UserType);
	ddUserType.selectByIndex(1);

	WebElement email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtEmailID']")));
	//eamil.sendKeys("admin@mailinator.com");	
	email.sendKeys(emailid);
	 
	WebElement statuscheck= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_chkActive']")));
	statuscheck.click(); 
	WebElement validfrom= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_chkActive']")));
	statuscheck.click(); 	 
	 
	WebElement datepicker= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtSubscriptionValidFrom']")));
	datepicker.click();
	datepicker.clear();
	datepicker.sendKeys("24/11/2025");
	datepicker.sendKeys(Keys.ENTER);
	 
	WebElement datepicker1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtSubscriptionValidTill']")));
	datepicker1.click();
	datepicker1.clear();
	datepicker1.sendKeys("29/11/2025");
	datepicker1.sendKeys(Keys.ENTER);
	 

	
	
	
	
	
	
	
	
	 
}

	
	

}
