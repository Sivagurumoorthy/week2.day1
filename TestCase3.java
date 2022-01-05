package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

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
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("SIVAGURU");
		driver.findElement(By.xpath("//option[@value='LEAD_CONFERENCE']")).click();
//		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
//		   Select dropdown = new Select(source);
//		   dropdown.selectByVisibleText("Conference");

		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("MR");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("SIVA GURUMOORTHY");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MR");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000000");
		WebElement PreferredCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		   Select droplist = new Select(PreferredCurrency);
		   droplist.selectByVisibleText("INR - Indian Rupee");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5000");
		 WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		   Select scroll = new Select(Industry);
		   scroll.selectByVisibleText("Computer Software");
		   WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		   Select school = new Select(Ownership);
		   school.selectByVisibleText("Sole Proprietorship");
		//enter the phone number
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8870419483");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gurusmart123@gmail.com");
		//Enter the address
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("114/4 PONNAGARAM 1ST STREET");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("MELUR THOOTHUKUDI");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("THOOTHUKUDI");
	 driver.findElement(By.xpath("//option[@value='IL']")).click();
	   driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("628002");
	  driver.findElement(By.className("smallSubmit")).click();
	 
			  WebElement title = driver.findElement(By.id("sectionHeaderTitle_leads"));
		title.getText();
		System.out.println(title.getText());
		
		
}

}
