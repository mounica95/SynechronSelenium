package Synechron.SyPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class LocatorsEg {
	

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/ap/signin");
		
		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("8019322320");
		
		WebElement continueButton = driver.findElement(By.className("a-button-input"));
		continueButton.click();
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("8019322320");
		
		WebElement ForgotPassword = driver.findElement(By.linkText("Forgot password?"));
		ForgotPassword.click();
		
		WebElement ForgotPassword1 = driver.findElement(By.partialLinkText("password"));
		ForgotPassword1.click();
			
		 
		
	}
		

	}

