package ExtentReports;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Drivers.DriverSetup;

import Home.Implement;

public class Tests {
	
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/automation.html");
	ExtentReports extent = new ExtentReports();

	public static WebDriver driver;

	@BeforeSuite
	public void setup() {

		driver = DriverSetup.getDriver();

	}

	@Test(priority = 0)
	public void popup() {
		extent.attachReporter(reporter);
		ExtentTest Test1 = extent.createTest("Test1", "Test to validate functionality of Popup closing");
		Test1.log(Status.INFO, "Starting the 1st scenario-Testcase 1");
		Implement implement = new Implement(driver);
		Test1.info("This will close the popup window");
		Implement.closePopup();
		Test1.pass("Passed");

	}

	@Test(priority = 1)
	public void bookshelves() {
		extent.attachReporter(reporter);
		ExtentTest Test1 = extent.createTest("Test1", "Test to validate functionality of opening bookshelves page");
		Test1.log(Status.INFO, "Starting the 1st scenario-Testcase 2");
		Implement implement = new Implement(driver);
		Test1.info("This will open the bookshelves page");
		Implement.openBookShelves();
		Test1.pass("Passed");
	}

	@Test(priority = 2)
	public void storage() throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest Test1 = extent.createTest("Test1", "Test to validate functionality of storage type");
		Test1.log(Status.INFO, "Starting the 1st scenario-Testcase 3");
		Implement implement = new Implement(driver);
		Test1.info("This will choose storage type as open");
		Implement.storageType();
		Test1.pass("Passed");
	}

	@Test(priority = 3)
	public void price() throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest Test1 = extent.createTest("Test1", "Test to validate functionality of price slider");
		Test1.log(Status.INFO, "Starting the 1st scenario-Testcase 4");
		Implement implement = new Implement(driver);
		Test1.info("This will select range of the price");
		Implement.slider();
		Test1.pass("Passed");
	}

	@Test(priority = 4)
	public void exclude() throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest Test1 = extent.createTest("Test1", "Test to validate functionality of exclude check box");
		Test1.log(Status.INFO, "Starting the 1st scenario-Testcase 5");
		Implement implement = new Implement(driver);
		Test1.info("This will select the exclude check box");
		Implement.excludeCheckbox();
		Test1.pass("Passed");

	}

	@Test(priority = 5)
	public void displayNameandPrice() {
		extent.attachReporter(reporter);
		ExtentTest Test1 = extent.createTest("Test1", "Test to print the name and price");
		Test1.log(Status.INFO, "Starting the 1st scenario-Testcase 6");
		Implement implement = new Implement(driver);
		Test1.info("This will print the name and price of first three bookshelves");
		Implement.print();
		Test1.pass("Passed");
	}

	@Test(priority = 6)
	public void collectionMenu() {
		extent.attachReporter(reporter);
		ExtentTest Test1 = extent.createTest("Test1", "Test to click the collection menu");
		Test1.log(Status.INFO, "Starting the 2nd scenario-Testcase 1");
		Implement implement = new Implement(driver);
		Test1.info("This will click the collection menu");
		Implement.collections();
		Test1.pass("Passed");

	}

	@Test(priority = 7)
	public void menuItems() throws Exception  {
		extent.attachReporter(reporter);
		ExtentTest Test1 = extent.createTest("Test1", "Test to print the menu items");
		Test1.log(Status.INFO, "Starting the 2nd scenario-Test case 2");
		Implement implement = new Implement(driver);
		Test1.info("This will print the menu itmes under Being at home");
		Implement.Beingprint();
		Test1.pass("Passed");
	}

	@Test(priority = 8)
	public void gift() throws InterruptedException  {
		extent.attachReporter(reporter);
		ExtentTest Test1 = extent.createTest("Test1", "Test to fill and validate the forms under giftcards");
		Test1.log(Status.INFO, "Starting the 3rd scenario");
		Implement implement = new Implement(driver);
		Test1.info("This will fill the forms and validate it");
		Implement.giftcards();
		Test1.pass("Passed");
	}

	@Test(priority = 9)
	public void capture() {
		extent.attachReporter(reporter);
		ExtentTest Test1 = extent.createTest("Test1", "Test to capture the screenshot of error message");
		Test1.log(Status.INFO, "Starting the 3rd scenario");
		Implement implement = new Implement(driver);
		Test1.info("This will capture the error message");
		Implement.screenshot();
		Test1.pass("Passed");
	}

	@AfterSuite
	public void closeBrowser() {
		extent.flush();

		driver.quit();
	}

}
