package GroupCalc.Calculator.appmanager;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TypeHelper extends HelperBase{

	 public TypeHelper (WebDriver wd) {

	        super(wd);
	    }
	 
	 public void digit( String text) {
			
			type(By.id("result"), text);		
			assertEquals(getResult((By.id("result"))), text);

		}
		
		
}
