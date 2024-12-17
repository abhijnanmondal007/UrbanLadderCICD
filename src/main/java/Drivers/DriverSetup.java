package Drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class DriverSetup {

	static String URL;
	static String location;
	static WebDriver driver;
	public static String userDir = System.getProperty("user.dir");

	public static WebDriver getDriver() {

		String Browser = "Chrome";
		if (Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chromedriver.com","/Users/abhijnansmac/eclipse-workspace/Driver/chromedriver-mac-x64");
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","/Users/abhijnansmac/eclipse-workspace/Driver");
			FirefoxOptions fo = new FirefoxOptions();
			driver= new FirefoxDriver(fo);
		} else  {
				System.setProperty("webdriver.edge.driver","/Users/abhijnansmac/eclipse-workspace/Driver/edgedriver_mac64");
				driver = new EdgeDriver();
		} 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		return driver;
	}
}

