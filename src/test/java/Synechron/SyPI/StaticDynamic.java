package Synechron.SyPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDynamic {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/");
		    
		Thread.sleep(2000);
		
		
		
		WebElement startWith = driver.findElement(By.xpath("//input[starts-with[@name='takeorder-']]"));
		WebElement endswith = driver.findElement(By.xpath("//input[ends-with[@name = '-takeorder']]"));
		WebElement containswith = driver.findElement(By.xpath("//input[contains(text(),'takeorder')]"));

	}

}
