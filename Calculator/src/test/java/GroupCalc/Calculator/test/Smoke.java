package GroupCalc.Calculator.test;

import org.testng.annotations.Test;

public class Smoke extends TestBase {
	@Test
	public void smokeTest() {

		app.press().universalDigit("1");
		app.press().sign("+");
		app.press().universalDigit("2");
		app.press().equality();
		app.press().resultCheck("3");
		app.press().clear();
	}
}
