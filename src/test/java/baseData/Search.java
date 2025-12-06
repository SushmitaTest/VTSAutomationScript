package baseData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Search extends baseLoginTest {

@Test
	public void search() throws InterruptedException
	{
	
	Login loginPage = new Login(driver);
	loginPage.loginTest("Admin","Admin@123$");
	Thread.sleep(3000);

	
	
//WebElement search= wait.until(ExpectedConditions.elementToBeClickable(By.name("search")));
//search.sendKeys();
		
	//SearchModule MODULES =new SearchModule(wait, driver);
	//MODULES.search("mastermenu");



		
		
		
		
		
	}
	
	
	
}
