package objects;

import org.openqa.selenium.WebDriver; // U folderu driver nalazi se ChromeDriver za Google Chrome Version 92.0.4515.159 (Official Build) (64-bit)

public class Driver {

	public static final String PATH_CHROME_DRIVER = System.getProperty("user.dir") + "\\src\\driver\\";

	public static void createDriver(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", PATH_CHROME_DRIVER + "chromedriver.exe");
	}
}
