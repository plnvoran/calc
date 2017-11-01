package GroupCalc.Calculator.appmanager;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Denis on 19.03.2017.
 */
public class ApplicationManager {

	WebDriver wd;

	private NavigationHelper navigationHelper;
	private PressHelper pressHelper;
	private TypeHelper typeHelper;
	private CheckHelper checkHelper;

	public void init() throws IOException {

		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		
		wd = new FirefoxDriver(dc);

		wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		navigationHelper = new NavigationHelper(wd);
		pressHelper = new PressHelper(wd);
		typeHelper = new TypeHelper(wd);
		checkHelper = new CheckHelper(wd);

	}

	public void stop() {
		// wd.quit();
	}

	public NavigationHelper goTo() {
		return navigationHelper;
	}

	public PressHelper press() {
		return pressHelper;
	}

	public TypeHelper type() {
		return typeHelper;
	}

	public CheckHelper check() {
		return checkHelper;
	}

}
