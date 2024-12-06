package Synechron.SyPI;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;



public class FileUpload {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/download");
		
		Thread.sleep(2000);
		
		WebElement download = driver.findElement(By.xpath("//a[contains(text(),'Kranthi.txt')]"));
		download.click();
		
		File f = new File("C:\\Users\\Kiosk_user\\Documents");
		
		if(f.exists()) {
			System.out.println("exists");
		}else {
			System.out.println("no");
		}
		
//		Thread.sleep(2000);
//		
//		WebElement submit = driver.findElement(By.xpath("//input[@id='file-submit']"));
//		submit.click();
//		
//		Thread.sleep(2000);
//		
//		WebElement fileuploaded = driver.findElement(By.xpath("//h3[contains(text(),'File Uploaded!')]"));
//		
//		if(fileuploaded.isDisplayed()) {
//			System.out.println("Uploaded");
//		}else {
//			System.out.println("not uploaded");
//		}
//		
		
		driver.close();

	}

}
