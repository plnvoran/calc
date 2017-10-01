package GroupCalc.Calculator.test;

import org.testng.annotations.Test;

import GroupCalc.Calculator.ExelUtility.Constant;
import GroupCalc.Calculator.ExelUtility.ExcelUtils;

public class PlusNegativeOperands extends TestBase{
  
	
	@Test
  public void f() throws Exception {
  
	
		
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData2, "Sheet1");

			for (int i = 1; i < Constant.numberOfTests + 1; i++) {

				app.press().universalDigit(ExcelUtils.getCellData(i, 1));
				app.press().sign("+");
				app.press().universalDigit(ExcelUtils.getCellData(i, 2));
				app.press().equality();
				
				if (app.press().resultCheckBoolean(ExcelUtils.getCellData(i, 4))==true) {

					ExcelUtils.setCellData("Pass", i, 3);
				}

				else {

					ExcelUtils.setCellData("Fail", i, 3);
				}

				app.press().clear();

			}
	}
}

		
  
