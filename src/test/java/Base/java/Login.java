package Base.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login {
	
    private WebDriver driver;
    private WebDriverWait wait;
    
	       By usernameField = By.id("txtUserName1");
		   By passwordField = By.xpath("//input[@type='password'][1]");
		   By clickBtn     = By.id("btnLogin");
		
	 public Login(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
	    }
	 
	 
	public void loginTest(String username, String password) throws InterruptedException
	{
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(clickBtn)).click();
        
       
    }
	

	
	
	
	
	
	
	
}





   
   

 
     




	
