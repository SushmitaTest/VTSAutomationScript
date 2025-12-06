package masterMenu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class CommandMaster  extends baseLoginTest {
	
	@Test
	public void McommandAdd() throws InterruptedException
	
	{
		 Login loginPage = new Login(driver);
	        loginPage.loginTest("Admin", "Admin@123$");
	        Thread.sleep(3000);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement mMenu = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Master Menu']")));
		mMenu.click();
		
	
		Thread.sleep(3000);
		WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement vendoreMod = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Command Master']")));
		vendoreMod.click();	
		
		Thread.sleep(3000);
		WebDriverWait wait3= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement comdmast = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtCommandDescription']")));
		comdmast.sendKeys("Testcomfor live");	
		
		Thread.sleep(3000);
		WebDriverWait wait4= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement comd = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtCommand']")));
		 comd.sendKeys("get1");
		
		
	//Thread.sleep(3000);
		WebDriverWait wait5= new WebDriverWait(driver, Duration.ofSeconds(30));
		/*WebElement comdType = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_chkCommandType_0']")));
		comdType.click();*/


		Thread.sleep(3000);
		WebElement comdType2 = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_chkCommandType_1']")));
		comdType2.click();
		 
	/*	int checkbox=3;
		for(int i =0;i<checkbox;i++ )
		{
			
			WebElement comdType2=wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_chkCommandType_"+ i+"']")));
			comdType2.click();
			Thread.sleep(3000);
			
			if(comdType2.isSelected())
				
			{
				comdType2.click();
				
				
			}
			
		}*/
		
	
		
		
		Thread.sleep(3000);
		WebDriverWait wait6= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement status = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Active']")));
		status.click();
		
		WebDriverWait wait75 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement save= wait75.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnSave']")));
		save.click();
		Thread.sleep(5000);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}
	
	

}
