package GroupCalc.Calculator.test;

import org.testng.annotations.Test;

public class PlusTest extends TestBase {

	
	@Test (priority=1)
	 public void smokePlus() {
	       	app.type().digit("100");
	        app.press().sign("+");
	        app.type().digit("200");
	        app.press().equality();
	        app.press().resultCheck("300");
	    }
}
