package GroupCalc.Calculator.test;

import org.openqa.selenium.UnhandledAlertException;

public class catch_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("try");
		}

		catch (Exception e) {
			
				System.out.println("catch");
			

		}
		
		finally {
		System.out.println("no catch");}
		
	}
}
