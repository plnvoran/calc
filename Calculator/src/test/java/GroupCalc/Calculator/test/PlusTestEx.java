package GroupCalc.Calculator.test;

import org.testng.annotations.Test;
import GroupCalc.Calculator.ExelUtility.ExcelUtils;
import GroupCalc.Calculator.ExelUtility.Constant;
import GroupCalc.Calculator.test.TestBase;

public class PlusTestEx extends TestBase {

	@Test
	public void f() throws Exception {
	
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");

		for (int i = 1; i < Constant.numberOfTests + 1; i++) {

			app.type().digit(ExcelUtils.getCellData(i, 1));
			app.press().sign("+");
			app.type().digit(ExcelUtils.getCellData(i, 2));
			app.press().equality();
			
			if (app.press().resultCheckBoolean(ExcelUtils.getCellData(i, 4))) {

				ExcelUtils.setCellData("Pass", i, 3);
			}

			else {

				ExcelUtils.setCellData("Fail", i, 3);
			}

			app.press().clear();

		}

	}

}
