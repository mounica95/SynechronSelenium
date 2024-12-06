package Synechron.SyPI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertEg {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(2000);
		
		WebElement simplealert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		simplealert.click();
		
	   Thread.sleep(2000);
		
		Alert alt1 = driver.switchTo().alert();
		alt1.dismiss();
		
		WebElement confirmalert = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirmalert.click();
		
		Alert alt2 = driver.switchTo().alert();
		String Alerttext = alt2.getText();
		System.out.println(Alerttext);
		alt2.dismiss();
		
		Thread.sleep(2000);
		
		
		WebElement promptalert = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		promptalert.click();
		
		Thread.sleep(2000);
		
		
		Alert alt3 = driver.switchTo().alert();
		String Alerttext2 = alt3.getText();
		alt3.sendKeys("text");
		alt3.accept();
		System.out.println(Alerttext2);
		
		
		
		driver.close();

	}

}
