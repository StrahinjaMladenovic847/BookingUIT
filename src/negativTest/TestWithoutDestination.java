package negativTest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import objects.BookingHomePage;
import objects.Driver;

public class TestWithoutDestination {

	WebDriver driver;

	@BeforeMethod
	public void openDriver() {

		Driver.createDriver(driver);
		driver = new ChromeDriver();

	}
	
	@Test
	public void testWithoutDestination() {
		
		BookingHomePage.openPage(driver);
		BookingHomePage.search(driver);
		assertTrue(driver.getPageSource().contains("Enter a destination"));
		
	}
	
	/*
	 * @AfterMethod public void closeDriver() {
	 * 
	 * driver.close();
	 * 
	 * }
	 */
}
