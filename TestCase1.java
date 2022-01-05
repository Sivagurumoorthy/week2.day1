package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		System.getProperty("webdriver.chrome.driver");
		ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
	WebElement userName = driver.findElement(By.id("username"));
userName.sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
//click on login button
driver.findElement(By.className("decorativeSubmit")).click();

//click on CRM/SFA Link
driver.findElement(By.linkText("CRM/SFA")).click();
//click on contacts tab
driver.findElement(By.linkText("Contacts")).click();

//click on Create Contact
driver.findElement(By.linkText("Create Contact")).click();
//Enter the First Name
driver.findElement(By.id("firstNameField")).sendKeys("SIVA GURUMOORTHY");

// Enter the last name
driver.findElement(By.id("lastNameField")).sendKeys("G");
// CLICK THE CREATE BUTTON
driver.findElement(By.className("smallSubmit")).click();

//Print
	String title = driver.getTitle();
	System.out.println("Browser Title: "+title);
	driver.close();


	}

}
