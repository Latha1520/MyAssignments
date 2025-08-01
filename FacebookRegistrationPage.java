package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationPage {

	public static void main(String[] args) {

		ChromeDriver drive = new ChromeDriver();
		drive.get("https://en-gb.facebook.com/ ");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		drive.findElement(By.xpath("//a[text()='Create new account']")).click();
		drive.findElement(By.name("firstname")).sendKeys("Latha");
		drive.findElement(By.name("lastname")).sendKeys("K");
		drive.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9551493494");
		drive.findElement(By.id("password_step_input")).sendKeys("Latha#152070");

		WebElement sourceelement = drive.findElement(By.id("day"));
		Select dropdown1 = new Select(sourceelement);
		dropdown1.selectByValue("20");

		WebElement sourceelement1 = drive.findElement(By.id("month"));
		Select dropdown2 = new Select(sourceelement1);
		dropdown2.selectByVisibleText("Nov");

		WebElement sourceelement2 = drive.findElement(By.id("year"));
		Select dropdown3 = new Select(sourceelement2);
		dropdown3.selectByValue("1995");

		drive.findElement(By.id("sex")).click();


	}

}
