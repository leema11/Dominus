package baseClass;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseNew {
	 static WebDriver driver;

		public static void Bowserlaunch() {
			driver = new ChromeDriver();
		}

		public static void geturl(String url) {
			driver.get(url);
		}

		public static void toMaximize() {
			driver.manage().window().maximize();
		}

		public static void implicitWait() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}

		public static void jsClick(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click() ;", element);
		}

		public static void jsScroll(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		}

		public static void explicitWait(WebElement locator) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
			wait.until(ExpectedConditions.elementToBeClickable(locator));

		}

		public static void log(String text) {
			System.out.println(text);
		}

		public static void quit() {
			driver.quit();
		}


}
