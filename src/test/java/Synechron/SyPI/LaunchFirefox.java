package Synechron.SyPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		
//        WebDriver driver1 = new ChromeDriver();
//        WebDriver driver2 = new FirefoxDriver();
        WebDriver driver3 = new EdgeDriver();
        
//        driver1.get("https://www.google.co.in/");
//        driver2.get("https://www.google.co.in/");
        driver3.get("https://www.google.co.in/");
        		
		
	}

}
