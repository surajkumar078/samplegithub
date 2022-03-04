package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	WebDriver driver;
	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}
}
