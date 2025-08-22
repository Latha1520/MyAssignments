package week4.day2.homeassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Merge')]")).click(); 
		
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::a")).click();
		 
		 ///images/fieldlookup.gif
	
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windowlist = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windowlist.get(1));
		
		WebElement element1 = driver.findElement(By.xpath("//a[text()='FrenchCustomer']"));
		element1.click();
		
		driver.switchTo().window(windowlist.get(0));
		//driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//div")).click();
		
		 WebElement element2 = driver.findElement(By.xpath("(//img[@src ='/images/fieldlookup.gif'])[2]"));
		 element2.click();
		driver.switchTo().window(windowlist.get(1));
		WebElement element3 = driver.findElement(By.xpath("//a[text()='FrenchCustomer']"));
		element3.click();
		
		
	
	}

}
