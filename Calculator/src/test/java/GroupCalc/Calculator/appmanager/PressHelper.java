package GroupCalc.Calculator.appmanager;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PressHelper extends HelperBase {

	public PressHelper(WebDriver wd) {

		super(wd);
	}

	public void pressOne() {

		click((By.id("button_opr1-4121")));

		assertEquals(getResult((By.id("result"))), "1");

	}

	public void pressTwo() {

		click((By.id("button_opr2-4122")));

		assertEquals(getResult((By.id("result"))), "2");

	}

	public void pressPlus() {

		click((By.id("button_oprpl-412pl")));

		assertEquals(getResult((By.id("tape"))).contains("+"), true);

	}

	public void pressEq() {

		click((By.id("button_oprrv-412rv")));

		assertEquals(getResult((By.id("tape"))).contains("="), true);

	}

	public void pressResultCheck(String etalon) {

		assertEquals(getResult((By.id("result"))), etalon);

	}

	public void clear() {

		click((By.id("button_oprcp-412cp")));

		assertEquals(getResult((By.id("result"))), "0");

	}

	public void pressButton(String digit) {

		click((By.id("button_opr" + digit + "-412" + digit)));

		assertEquals(getResult((By.id("result"))), digit);

	}

	public void pressSign(String sign) {

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

}
