package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		System.getProperty("webdriver.chrome.driver");
		// launch the Browser
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("http://leaftaps.com/opentaps");
		// Maximize the browser
		driver.manage().window().maximize();
		//get the title
		String Title = driver.getTitle();
		System.out.println(Title);
		// Enter the Username
	WebElement userName = driver.findElement(By.id("username"));
userName.sendKeys("DemoSalesManager");
//Enter the Password
driver.findElement(By.id("password")).sendKeys("crmsfa");
//click on login button
driver.findElement(By.className("decorativeSubmit")).click();

//click on CRM/SFA Link
driver.findElement(By.linkText("CRM/SFA")).click();
//click on contacts tab
driver.findElement(By.linkText("Contacts")).click();
driver.findElement(By.linkText("Find Contacts")).click();
driver.findElement(By.linkText("Email")).click();
driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("gurusmart123@gmail.com");
driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();







	}

}
