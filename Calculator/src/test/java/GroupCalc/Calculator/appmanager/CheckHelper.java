package GroupCalc.Calculator.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;

public class CheckHelper extends HelperBase {

	public CheckHelper(WebDriver wd) {
		super(wd);
		
	}

	
	
	
	public boolean divisionByZero() {

		boolean result = false;

		click((By.id("button_oprrv-412rv")));


		if (isAlertPresent()) {
			try {
				((JavascriptExecutor) wd).executeScript("window.close()");
			}

			catch (UnhandledAlertException e) {
				if (getResult((By.id("tape"))).equals("0")) {
					result= true;
				}
			}
		}

		return result;

	}
	
}
