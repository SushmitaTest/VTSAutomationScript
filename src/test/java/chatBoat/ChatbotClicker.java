package chatBoat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

import java.time.Duration;
import java.util.List;

public class ChatbotClicker  extends baseLoginTest {
	@Test
    public  void ChatbotClicker() throws InterruptedException
    {
		Login loginPage = new Login(driver);
		loginPage.loginTest("Admin","Admin@123$");
		Thread.sleep(3000);

		WebElement element = wait.until(
		    ExpectedConditions.elementToBeClickable(By.id(".mt-launcher")));
		element.click();

        
        
        
        
      
    }
}
