package GroupCalc.Calculator.test;



import org.testng.annotations.Test;





public class Smoke extends TestBase {
    

    @Test
    public void testCntactCreation() {
       
    	app.goTo().homePage();
        app.button().pressOne();
        app.button().pressPlus();
        app.button().pressTwo();
        app.button().pressEq();
        app.button().pressResultCheck("3");
        app.button().clear();

    }


}
