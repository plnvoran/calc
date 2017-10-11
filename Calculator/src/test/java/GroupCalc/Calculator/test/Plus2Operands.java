package GroupCalc.Calculator.test;

import org.testng.annotations.Test;

import GroupCalc.Calculator.ExelUtility.Constant;
import GroupCalc.Calculator.ExelUtility.ExcelUtils;

public class Plus2Operands extends TestBase {


	 @Test
	public void testPlus2Operands() throws Exception {
		 
		 String pathToFile = Constant.Path_TestData + Constant.Test2Operands;

		ExcelUtils.setExcelFile(pathToFile, "Plus");

		int i = 1;
		while (!ExcelUtils.getCellData(i, 0).equals("")) {

			app.press().universalDigit(ExcelUtils.getCellData(i, 0));
			app.press().sign("+");
			app.press().universalDigit(ExcelUtils.getCellData(i, 1));
			app.press().equality();

			if (app.press().resultCheckBoolean(ExcelUtils.getCellData(i, 2)) == true) {

				ExcelUtils.setCellDataUn("Pass", i, 3, pathToFile);
			}

			else {

				ExcelUtils.setCellDataUn("Fail", i, 3, pathToFile);
			}

			app.press().clear();

			i++;
		}

	}
}
