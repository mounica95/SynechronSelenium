package Synechron.SyPI;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		    
		Thread.sleep(2000);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		
		WebElement clickHere = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		clickHere.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		
		Iterator<String> itr = allWindows.iterator();
		
		while(itr.hasNext()) {
			
			String childWindow = itr.next();
			
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				
				String text = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText();
				System.out.println(text);
				
				driver.quit();
				
			}
		}
		
	}

}
