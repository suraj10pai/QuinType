package AppHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Factory.Driverfactory;
import Utils.ConfigReader;
import io.cucumber.java.Before;

public class ApplicationHooks {


	private Driverfactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();

	}

	@Before(order = 1)
	public void launchBrowser() {
		String browsername = prop.getProperty("browser");
		System.out.println(browsername);
		driverFactory = new Driverfactory();
		driver = driverFactory.init_browser(browsername);
	}
	
}
