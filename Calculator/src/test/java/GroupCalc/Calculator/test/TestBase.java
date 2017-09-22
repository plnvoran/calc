package GroupCalc.Calculator.test;


import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import GroupCalc.Calculator.appmanager.ApplicationManager;





/**
 * Created by Denis on 18.03.2017.
 */
public class TestBase {
   

    protected static final ApplicationManager app
            = new ApplicationManager();

    @BeforeSuite
    public void setUp() throws Exception {

        app.init();

    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }

    
}
