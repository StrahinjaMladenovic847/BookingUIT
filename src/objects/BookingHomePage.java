package objects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resource.BookingHomePageConstans;

public class BookingHomePage {

	public static void enterDestination(WebDriver driver) {

		driver.navigate().to(BookingHomePageConstans.BOOKING_URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id(BookingHomePageConstans.LOCATION_SEARCH_ID)).sendKeys("Paris");
		driver.findElement(By.xpath(BookingHomePageConstans.PARIS_XPATH)).click();

	}

	public static void chooseDate(WebDriver driver) {

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		while (!containsOctober(driver)) {
			driver.findElement(By.cssSelector(BookingHomePageConstans.NEXT_DATE_BTN_CSS)).click();
		}

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		driver.findElement(By.xpath(BookingHomePageConstans.CHECK_IN_XPATH)).click();
		driver.findElement(By.xpath(BookingHomePageConstans.CHECK_OUT_XPATH)).click();

	}

	public static boolean containsOctober(WebDriver driver) {

		String innerHtml = driver.findElement(By.xpath(BookingHomePageConstans.DIV_RIGHT_CALENDAR_XPATH))
				.getAttribute("innerHTML");
		return (innerHtml.contains("October"));

	}

	public static void passengers(WebDriver driver) {

		driver.findElement(By.id(BookingHomePageConstans.GUEST_TOGGLE_ID)).click();
		driver.findElement(By.xpath(BookingHomePageConstans.ADD_CHILD_XPATH)).click();
		driver.findElement(By.xpath(BookingHomePageConstans.CHILD_AGE_BUTTON_XPATH)).click();
		driver.findElement(By.xpath(BookingHomePageConstans.CHILD_AGE_XPATH)).click();
	}

	public static void search(WebDriver driver) {

		driver.findElement(By.xpath(BookingHomePageConstans.SEARCH_BUTTON_XPATH)).click();

	}

	public static void searchDestinationCommon(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		enterDestination(driver);
		chooseDate(driver);
		passengers(driver);
		search(driver);

	}
	
	public static void openPage(WebDriver driver) {
		
		driver.navigate().to(BookingHomePageConstans.BOOKING_URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
}
