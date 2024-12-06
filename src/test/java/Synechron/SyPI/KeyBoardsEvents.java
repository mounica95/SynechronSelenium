package Synechron.SyPI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardsEvents {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		    
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("username"));
		
		Actions act = new Actions(driver);
		
		Actions seriesofact = act.moveToElement(username).keyDown(username, Keys.SHIFT).sendKeys("hello");
		
		seriesofact.build().perform();
		Thread.sleep(2000);

	}

}
