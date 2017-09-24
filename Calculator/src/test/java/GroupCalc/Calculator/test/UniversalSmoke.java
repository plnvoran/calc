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
	        app.press().clear();

	    }
	@Test (priority=2)
	 public void smokeMinus() {
	       
	    	
	        app.press().button("2");
	        app.press().sign("-");
	        app.press().button("1");
	        app.press().equality();
	        app.press().resultCheck("1");
	        app.press().clear();

	    }
	
	@Test (priority=3)
	 public void smokeDev() {
	       
	    	
	        app.press().button("4");
	        app.press().sign("/");
	        app.press().button("2");
	        app.press().equality();
	        app.press().resultCheck("2");
	        app.press().clear();

	    }
	
	@Test (priority=4)
	 public void smokeMul() {
	       
	    	
	        app.press().button("3");
	        app.press().sign("*");
	        app.press().button("2");
	        app.press().equality();
	        app.press().resultCheck("6");
	        app.press().clear();

	    }
	
	@Test (priority=5)
	 public void typeTest() {
	       
	    	
	        app.press().button("3");
	        app.press().sign("*");
	        app.press().button("2");
	        app.press().equality();
	        app.press().resultCheck("6");
	        app.press().clear();

	    }
}
