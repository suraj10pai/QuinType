package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public WebDriver init_browser(String browser) {

		System.out.println("Browser value is " + browser);

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}

		else {
			System.out.println("Please enter the correct browser" + browser);
		}

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		//getDriver().get("https://todomvc.com/examples/react/#/");
		return getDriver();

	}

	public static synchronized WebDriver getDriver() {

		return tlDriver.get();

	}
}