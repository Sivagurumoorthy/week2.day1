package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// setup the driver 
		WebDriverManager.chromedriver().setup();
		// launch the Browser
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("http://leaftaps.com/opentaps");
		// Maximize the browser
		driver.manage().window().maximize();
		//get the title
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
	}

}
