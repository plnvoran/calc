package GroupCalc.Calculator.test;

import org.testng.annotations.Test;

public class PressAllButtons extends TestBase{

	
	@Test (priority=1)
	 public void smokePlus() {
	       
	    for (int i=1; i<10; )
	        app.press().button(i);
	        app.press().clear();

	    }
	
	
}
