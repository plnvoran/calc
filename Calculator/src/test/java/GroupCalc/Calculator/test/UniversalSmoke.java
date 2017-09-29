package GroupCalc.Calculator.test;

import org.testng.annotations.Test;

public class UniversalSmoke extends TestBase{

	
	@Test (priority=1)
	 public void smokePlus() {
	       
	    
	        app.press().button("5");
	        app.press().sign("+");
	        app.press().button("6");
	        app.press().equality();
	        app.press().resultCheck("11");
	      
	        app.press().invertion();
	        app.press().clear();

	    }
	
	
}
