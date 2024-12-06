package Synechron.SyPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frameseg {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		    
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		WebElement sauceBag = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]"));
	    String a = 	sauceBag.getText();
	    System.out.println(a);
	    
		WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addToCart.click();
		
		Thread.sleep(2000);
		
		WebElement cart = driver.findElement(By.className("shopping_cart_badge"));
		cart.click();
		
		Thread.sleep(2000);
		
		WebElement cartItem = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]"));
		String b = cartItem.getText();
		System.out.println(b);
		
		if(a.equals(b)) {
			System.out.println("Verified");
		}else {
			System.out.println("No");
		}
		
		WebElement checkOut = driver.findElement(By.xpath("//button[@id='checkout']"));
		checkOut.click();
		
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.id("first-name"));
		firstName.sendKeys("hgf");
		
		Thread.sleep(2000);
		
		WebElement secondName = driver.findElement(By.id("last-name"));
		secondName.sendKeys("hgf");
		
		Thread.sleep(2000);
		
		WebElement zipCode = driver.findElement(By.id("postal-code"));
		zipCode.sendKeys("7690");
		
		Thread.sleep(2000);
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		Thread.sleep(2000);
		
		WebElement finishButton = driver.findElement(By.id("finish"));
		finishButton.click();
		
		
		
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		
//		driver.switchTo().frame(frame);
//		
//		Thread.sleep(2000);
//		
//		WebElement newyork = driver.findElement(By.xpath("//label[contains(text(),'New York')]"));
//		
//		
//		
//	
//		newyork.click();
		

	}

}
