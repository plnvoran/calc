package GroupCalc.Calculator.appmanager;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PressHelper extends HelperBase {

	public PressHelper(WebDriver wd) {

		super(wd);
	}

	public void button(String digit) {
		click((By.id("button_opr" + digit + "-412" + digit)));
		assertEquals(getResult((By.id("result"))), digit);
	}

	public void sign(String sign) {
		String signStr = null;
		String checkStr = null;
		if (sign.equals("+")) {
			signStr = "pl";
			checkStr = "+";
		} else if (sign.equals("-")) {
			signStr = "mi";
			checkStr = "-";
		}
		else if (sign.equals("/")) {
			signStr = "de";
			checkStr = "÷";
		} else if (sign.equals("*")) {
			signStr = "um";
			checkStr = "x";
		}
		click((By.id("button_opr" + signStr + "-412" + signStr)));
		assertEquals(getResult((By.id("tape"))).contains(checkStr), true);
	}

	public void equality() {
		click((By.id("button_oprrv-412rv")));
		assertEquals(getResult((By.id("tape"))).contains("="), true);
	}

	public void resultCheck(String etalon) {
		assertEquals(getResult((By.id("result"))), etalon);
	}

	public boolean resultCheckBoolean(String etalon) {
		
		if (getResult((By.id("result"))).equals(etalon))
		{
			return true;
		}
		else {
			
			return false;
		}
		
	}
	
	public void clear() {
		click((By.id("button_oprcp-412cp")));
		assertEquals(getResult((By.id("result"))), "0");
	}

	
	public void universalDigit(String text) {
		
		
		if (text.substring(0, 1).equals("-"))
		{
			type(By.id("result"), 	text.substring(1));
			invertion();
		}
		else
			type(By.id("result"), 	text);
			
		
		assertEquals(getResult((By.id("result"))), text);

	}
	
	public void invertion () {
		
		click((By.id("button_oprpm-412pm")));
		assertEquals(getResult((By.id("tape"))).contains("-"), true);
	}


}
