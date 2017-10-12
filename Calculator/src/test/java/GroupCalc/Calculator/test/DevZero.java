package GroupCalc.Calculator.test;

import org.testng.annotations.Test;

public class DevZero extends TestBase {

	@Test
	public void f() {

		app.press().universalDigit("0");
		app.press().sign("/");
		app.press().universalDigit("0");

		boolean ifSecondOperIsZero = app.press().resultCheckBoolean("0");

		app.press().equality();

		if (ifSecondOperIsZero == true) {
			if (app.check().divisionByZero()) {

				System.out.println("###############   OK");
				
			} else {

				System.out.println("!!!!!!!!!!!!!!!!!!!!  NO OK");
			}

		}

	}

}
