package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountassignment1 {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("accountName")).sendKeys("Latha K");
		driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester");

		WebElement sorceelement1 = driver.findElement(By.name("industryEnumId"));
		Select dropdown1 = new Select(sorceelement1);
		dropdown1.selectByValue("IND_SOFTWARE");

		WebElement sourceelement2 = driver.findElement(By.name("ownershipEnumId"));
		Select dropdown2 = new Select(sourceelement2);
		dropdown2.selectByVisibleText("S-Corporation");


		WebElement sorceelement3 =	driver.findElement(By.id("dataSourceId"));
		Select dropdown3 = new Select(sorceelement3);
		dropdown3.selectByValue("LEAD_EMPLOYEE");

		WebElement sorceelement4 =	driver.findElement(By.id("marketingCampaignId"));
		Select dropdown4 = new Select(sorceelement4);
		dropdown4.selectByIndex(6);

		WebElement sorceelement5 =	driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown5 = new Select(sorceelement5);
		dropdown5.selectByValue("TX");

		driver.findElement(By.className("smallSubmit")).click();

		driver.close();


	}

}
