package GroupCalc.Calculator.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Denis on 19.03.2017.
 */
public class NavigationHelper extends HelperBase {


    public NavigationHelper(WebDriver wd) {

        super(wd);
    }

//https://normal-calc.ru/
    /*Ссылка в меню*/
    public void groupPage() {
        if (isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
            return;
        }
        click(By.linkText("groups"));
    }


    public void homePage() {

    	 wd.get("https://normal-calc.ru/");
        
    	 if (isElementPresent(By.id("result"))) {

            return;
        }

      


    }
}
