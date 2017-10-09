package GroupCalc.Calculator.test;

import org.testng.annotations.Test;

public class PressAllButtons extends TestBase {

	@Test(priority = 1)
	public void pressZero() {

		app.press().twoButton("1", "0");
		app.press().clear();

	}

	@Test(priority = 2)
	public void pressFromOneToNine() {

		for (int i = 1; i < 10; i++) {
			app.press().button(Integer.toString(i));
			app.press().clear();
		}
	}
}
