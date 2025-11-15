package AllModules;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v124.indexeddb.model.Key;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.java.Login;
import Base.java.baseLoginTest;

public class MasterSubscriptionMaster extends baseLoginTest  {
	
@DataProvider(name="date")	
public String[][] getDATE()
{
 return new String[][]
		 
		 
		 {
	       {  "10/11/2025" ,"valid"        },
	       {  "32/11/2025" ,"invalid"        },
	      
		 };
	
	
}
	
	
	@Test  (dataProvider ="date")
	public void addSubscription(String date ,String desc) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		 Login loginPage = new Login(driver);
	        loginPage.loginTest("Admin", "Admin@123$");	
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
WebElement masterMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Master Menu']")));
     masterMenu.click();
	
     //
     WebDriverWait wait111 = new WebDriverWait(driver, Duration.ofSeconds(30));
     WebElement subscr = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Subscription Setting']")));
     subscr.click();

	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
WebElement Vname = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlVendorName']")));
Vname.click();
	/*Select ddvname =new Select(Vname);
	ddvname.selectByIndex(12);*/
			
	Thread.sleep(3000);
	 WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(30));
WebElement BRname1 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='2']")));
BRname1.click();
	/*Select ddBRname =new Select(BRname1);
	ddBRname.selectByIndex(1);*/
			
	
	
	 WebDriverWait wait3= new WebDriverWait(driver, Duration.ofSeconds(30));
WebElement Usname = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_CmbUser']")));
Usname .click();
	Select ddUsname  =new Select(Usname );
	ddUsname.selectByIndex(2);
	
	 WebDriverWait wait4= new WebDriverWait(driver, Duration.ofSeconds(30));
WebElement activeCheckbox = wait4.until(ExpectedConditions
	    .visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_chkActive")));
	//  activeCheckbox.click();
	if(activeCheckbox.isSelected())
	{
		  activeCheckbox.click();
		
	}
	
WebDriverWait wait5= new WebDriverWait(driver, Duration.ofSeconds(30));	
WebElement validf = wait5.until(ExpectedConditions .visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtValidFrom']")));
validf.click();
validf.sendKeys(date);



	
WebDriverWait wait7= new WebDriverWait(driver, Duration.ofSeconds(30));	
WebElement validtill = wait7.until(ExpectedConditions .visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtValidTill']")));
validtill.click();
validtill.sendKeys("10/11/2026");



WebDriverWait wait75 =new WebDriverWait(driver, Duration.ofSeconds(30));
WebElement save= wait75.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnSave']")));
save.click();
Thread.sleep(5000);


	        
	}
}
