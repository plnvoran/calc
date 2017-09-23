package GroupCalc.Calculator.test;

import org.testng.annotations.Test;

public class UniversalSmoke extends TestBase{

	
	@Test (priority=1)
	 public void smokePlus() {
	       
	    	app.goTo().homePage();
	        app.button().pressButton("5");
	        app.button().pressSign("+");
	        app.button().pressButton("6");
	        app.button().pressEq();
	        app.button().pressResultCheck("11");
	        app.button().clear();

	    }
	@Test (priority=2)
	 public void smokeMinus() {
	       
	    	app.goTo().homePage();
	        app.button().pressButton("2");
	        app.button().pressSign("-");
	        app.button().pressButton("1");
	        app.button().pressEq();
	        app.button().pressResultCheck("1");
	        app.button().clear();

	    }
	
	@Test (priority=3)
	 public void smokeDev() {
	       
	    	app.goTo().homePage();
	        app.button().pressButton("4");
	        app.button().pressSign("/");
	        app.button().pressButton("2");
	        app.button().pressEq();
	        app.button().pressResultCheck("2");
	        app.button().clear();

	    }
	
	@Test (priority=4)
	 public void smokeMul() {
	       
	    	app.goTo().homePage();
	        app.button().pressButton("3");
	        app.button().pressSign("*");
	        app.button().pressButton("2");
	        app.button().pressEq();
	        app.button().pressResultCheck("6");
	        app.button().clear();

	    }
}
