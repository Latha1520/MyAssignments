package week5.day2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestNGAnnotations {
	
	public static void main(String[] args) {
		
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("guest");
	
	ChromeDriver driver = new ChromeDriver(options);
	
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	}
	

}
