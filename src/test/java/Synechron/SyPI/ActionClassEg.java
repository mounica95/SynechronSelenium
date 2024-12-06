package Synechron.SyPI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassEg {

	public static void main(String[] args) throws InterruptedException {
		
//		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
       driver.navigate().to("https://practicetestautomation.com/");
		
//		driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		
        Thread.sleep(3000);
	    
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        js.executeScript("window.scrollBy(0,600)", "");
        
        Thread.sleep(3000);
        
		js.executeScript("window.scrollBy(0,-600)", "");
		
		Thread.sleep(3000);
		
		
//		WebElement privacypolicy = driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]"));
//		
//		Actions act = new Actions (driver);
//		act.scrollToElement(privacypolicy).perform();
//		Thread.sleep(3000);
//		
//		privacypolicy.click();
//		
//		driver.close();
//		
		
//		Double CLick
		
//		WebElement BestSellers = driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]"));
//		Actions act = new Actions (driver);
//		act.doubleClick(BestSellers).perform();
//		
//		Thread.sleep(5000);
//		
//		driver.navigate().back();
//		
//		Thread.sleep(5000);
//		
//		WebElement Mobiles = driver.findElement(By.xpath("(//a[contains(text(),'Mobiles')])"));
//		act.contextClick(Mobiles).perform();
//		
//		Thread.sleep(5000);
//		
		driver.close();
		
		

	}

}
