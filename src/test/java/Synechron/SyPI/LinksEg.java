package Synechron.SyPI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksEg {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/");
		    
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int size = links.size();
		System.out.println(size);
		
		for(WebElement link : links) {
			System.out.println(link.getText());
		}

	}

}
