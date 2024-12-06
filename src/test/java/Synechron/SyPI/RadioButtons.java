package Synechron.SyPI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {


	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		WebElement Dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select sel = new Select(Dropdown);
		
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		
		sel.selectByValue("option2");
		
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Option3");
		
		driver.close();
		
		
//		List<WebElement> radioButton = driver.findElements(By.xpath("//input[@name = 'radioButton']"));
//		int size1 = radioButton.size();
//		System.out.println(size1);
//        
//		for(int y=0; y<=size1; y++) {
//			
//			Thread.sleep(2000);
//			
//			radioButton.get(y).click();
//		
//		
////		for loop for clicking check boxes
//		
//		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		int size = checkBoxes.size();
//		System.out.println(size);
//		
//		for(int i=0; i<=size; i++) {
//			
//			Thread.sleep(2000);
//			
//			checkBoxes.get(i).click();
//		
//		}
		
		
	}
	

}
