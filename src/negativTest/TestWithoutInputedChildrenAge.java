package negativTest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import objects.BookingHomePage;
import objects.Driver;
import resource.BookingHomePageConstans;

public class TestWithoutInputedChildrenAge {

	WebDriver driver;

	@BeforeMethod
	public void openDriver() {

		Driver.createDriver(driver);
		driver = new ChromeDriver();

	}
	
	@Test
	public void inputParametarsWithoutChildAge() {
		
		BookingHomePage.openPage(driver);
		BookingHomePage.enterDestination(driver);
		BookingHomePage.chooseDate(driver);
		driver.findElement(By.id(BookingHomePageConstans.GUEST_TOGGLE_ID)).click();
		driver.findElement(By.xpath(BookingHomePageConstans.ADD_CHILD_XPATH)).click();
		driver.findElement(By.xpath(BookingHomePageConstans.CHILD_AGE_BUTTON_XPATH)).click();
		BookingHomePage.search(driver);
		assertTrue(driver.getPageSource().contains("Age needed"));
		
	}
	
	/*
	 * @AfterMethod public void closeDriver() {
	 * 
	 * driver.close();
	 * 
	 * }
	 */
}
