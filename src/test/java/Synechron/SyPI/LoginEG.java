package Synechron.SyPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginEG {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		String currentURL1 = driver.getCurrentUrl();
		System.out.println(currentURL1);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("student");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Password123");
		
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		
		WebElement homelogo = driver.findElement(By.className("custom-logo-link"));
	    
		if(homelogo.isDisplayed()) {
		System.out.println("homepage");
		}else{
			System.out.println("not displayed");}
		
		
//		String title2 = driver.getTitle();
//		System.out.println(title2);
//		
//		String currentURL = driver.getCurrentUrl();
//		System.out.println(currentURL);
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().forward();
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().refresh();
////		
////		String pageSource = driver.getPageSource();
////		System.out.println(pageSource);
//		
//		driver.close();
	}

}
