package Synechron.SyPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		    
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("jalakammounica@gmail.com");
		driver.findElement(By.name("password")).sendKeys("!YWR3q8#293XKbk");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		

			
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		
		Thread.sleep(2000);
		
		//table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr[1]/td[2]
		//table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr[2]/td[2]
		//table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr[3]/td[2]
		//table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr[4]/td[2]
		
		String before_xpath = "//table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr[";
		String after_xpath = "]/td[2]";
		
		for(int i=1; i<=4;i++) {
			String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			System.out.println(name);
			
			if(name.contains("Deepak Patil")) {
				driver.findElement(By.xpath("(//div[@class='ui fitted read-only checkbox'])[1]")).click();
				
				
				
			}
		}
		
		
		
		

	}

}
