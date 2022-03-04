package negativTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import objects.BookingHomePage;
import objects.Driver;
import resource.BookingHomePageConstans;

public class TestSubscribeWithoutCredentials {

	WebDriver driver;

	@BeforeMethod
	public void openDriver() {

		Driver.createDriver(driver);
		driver = new ChromeDriver();

	}
	
	@Test
	public void subscribeBlank() {
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		BookingHomePage.openPage(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.id(BookingHomePageConstans.SUBSCRIBE_BUTTON_ID)).click();
		
	}
	
	/*
	 * @AfterMethod public void closeDriver() {
	 * 
	 * driver.close();
	 * 
	 * }
	 */
}
