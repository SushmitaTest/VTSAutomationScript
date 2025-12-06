package baseData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchModule  {
WebDriver driver;	
WebDriverWait  wait;


 By name =By.name("search");
	
	
	
	SearchModule(WebDriverWait wait,WebDriver driver)
	{
		this.wait =wait;
		this.driver =driver;
		
		
	}
		
	/*public void search(String searchdata)
	{
		
		WebElement search= wait.until(ExpectedConditions.elementToBeClickable(name));
		search.sendKeys(searchdata);
		
		
	}*/
		
		
		
		

	
	

}
