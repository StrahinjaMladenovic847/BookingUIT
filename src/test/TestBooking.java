package test;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import objects.BookingHomePage;
import objects.BookingSearchResultPage;
import objects.Driver;

public class TestBooking {

	WebDriver driver;

	@BeforeMethod
	public void openDriver() {

		Driver.createDriver(driver);
		driver = new ChromeDriver();

	}

	@Test(priority = 1)
	public void testSearchDestination() {

		BookingHomePage.searchDestinationCommon(driver);
		BookingSearchResultPage.serchHotel(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		assertTrue(BookingSearchResultPage.containsName(driver));

	}
	/*
	 * @AfterMethod public void closeDriver() {
	 * 
	 * driver.close();
	 * 
	 * }
	 */
}

/*
 * “Go to www.booking.com 
 *1. Enter “Paris” as destination 
 *2. Choose the start and end dates between 19th and 25th of October (drugi datum ako ovaj nije dostupan)
 *3. Select: 2 Adults, 1 Child and 1 Room 
 *4. Click on “Search” button 
 *5. Select “Novotel Paris Les Halles” (drugi hotel ako ovaj vise ne postoji)
 *  
 * 
 * Using Selenium framework perform first the positive flow by the steps above.
 * If there is a time, perform some negative test cases. Use your own Selenium
 * framework and preferable web browser. The test should be functional and
 * presentable.”
 * 
 * Testiranje je radjeno na OS WIN10 64 bit, Google Chrome Version 92.0.4515.159 (Official Build) (64-bit)
 * 
 * U testu1 u polje za pretragu uneo sam ime hotela (posto ga nije bilo na listi) i testirao da li otvara stranu sa trazenim hotelom
 */