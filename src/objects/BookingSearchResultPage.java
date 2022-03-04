package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resource.BookingSearchResultPageConstants;

public class BookingSearchResultPage {

	public static void serchHotel(WebDriver driver) {

		driver.findElement(By.id(BookingSearchResultPageConstants.SEARCH_HOTEL_ID)).clear();
		driver.findElement(By.id(BookingSearchResultPageConstants.SEARCH_HOTEL_ID))
				.sendKeys(BookingSearchResultPageConstants.HOTEL_NAME);
		driver.findElement(By.xpath(BookingSearchResultPageConstants.NOVOTEL_HOTEL_XPATH)).click();
		driver.findElement(By.xpath(BookingSearchResultPageConstants.SEARCH_BTN_XPATH)).click();
		driver.findElement(By.xpath(BookingSearchResultPageConstants.NOVOTEL_LINK_XPATH)).click();

	}

	public static boolean containsName(WebDriver driver) {

		return (driver.getPageSource().contains(BookingSearchResultPageConstants.HOTEL_NAME));

	}
}
