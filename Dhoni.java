package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dhoni {

	public static void main(String[] args) {
		// setup the driver 
				WebDriverManager.chromedriver().setup();
				// launch the Browser
				ChromeDriver driver = new ChromeDriver();
				// load the url
				driver.get("https://www.google.com/search?q=shahrukh+khan&rlz=1C1CHBF_enIN870IN870&ei=VSXQYfv0Dsrjz7sP7puq0As&gs_ssp=eJzj4tTP1TcwrMowsjRg9OItzkjMKCrNzlDIzkjMAwBlUwg1&oq=sharukha&gs_lcp=Cgdnd3Mtd2l6EAEYCTIKCAAQsQMQsAMQCjIHCAAQsAMQCjIHCAAQsAMQCjIKCAAQsQMQsAMQCjIKCAAQsQMQsAMQCjIHCAAQsAMQCjIHCAAQsAMQCjIKCAAQsQMQsAMQCjIKCAAQsQMQsAMQCjINCC4QsQMQyAMQsAMQCjINCC4QsQMQyAMQsAMQCkoECEEYAUoECEYYAFAAWABg-iloAnAAeACAAQCIAQCSAQCYAQDIAQvAAQE&sclient=gws-wiz");
				// Maximize the browser
				driver.manage().window().maximize();
				//get the title
				String Title = driver.getTitle();
				System.out.println(Title);

	}

}
