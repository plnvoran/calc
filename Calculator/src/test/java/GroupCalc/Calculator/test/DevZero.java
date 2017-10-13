package GroupCalc.Calculator.test;

import org.testng.annotations.Test;

public class DevZero extends TestBase {

	@Test
	public void f() {

		app.press().universalDigit("5");
		app.press().sign("/");
		app.press().universalDigit("0");
		
		if (app.press().equalityForDivision()) {
			

				System.out.println("###############   OK");
				
			} 
		else {

				System.out.println("!!!!!!!!!!!!!!!!!!!!  NO OK");
			}

		

	}

}
