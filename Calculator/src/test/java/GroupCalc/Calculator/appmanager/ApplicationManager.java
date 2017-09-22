package GroupCalc.Calculator.appmanager;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
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
    private  PressHelper pressHelper;
    
   



   


    public void init() throws IOException {
       
               wd = new FirefoxDriver();
          

        wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       
        navigationHelper = new NavigationHelper(wd);
        pressHelper = new PressHelper(wd);
       
      
      

    }



    public void stop() {
       // wd.quit();
    }

   
   

    public NavigationHelper goTo() {
        return navigationHelper;
    }
    
    public PressHelper button() {
        return pressHelper;
    }

    
}
