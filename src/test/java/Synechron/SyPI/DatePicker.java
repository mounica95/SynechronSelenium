package Synechron.SyPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		    
		Thread.sleep(2000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.click();
		
		Thread.sleep(2000);
		
		WebElement datepicker = driver.findElement(By.xpath("(//a[contains(text(),'5')])[1]"));
		datepicker.click();
		
		Thread.sleep(2000);
		
		String D = datepicker.getText();
		System.out.println(D);
		
		
	}

}
