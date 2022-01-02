package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SystemGetProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //setup the driver 
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
// Enter the Password
driver.findElement(By.id("password")).sendKeys("crmsfa");
// click on login button
driver.findElement(By.className("decorativeSubmit")).click();

// click on CRM/SFA Link
driver.findElement(By.linkText("CRM/SFA")).click();
// click on create leads
driver.findElement(By.linkText("Create Lead")).click();
//Enter the company name
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TEST LEAF");
//Enter the first name
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SIVA GURUMOORTHY");
//Enter the Last name
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");


	}

}
