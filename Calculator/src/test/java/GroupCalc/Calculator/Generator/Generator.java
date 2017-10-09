package GroupCalc.Calculator.Generator;

import org.testng.annotations.Test;

import GroupCalc.Calculator.ExelUtility.Constant;
import GroupCalc.Calculator.ExelUtility.ExcelUtils;

public class Generator {

	@Test
	public void f() throws Exception {

		String pathToFile = Constant.Path_TestData + Constant.File_Generator;

		ExcelUtils.setExcelFile(pathToFile, "Sheet1");
		int i = 1;
		while (!ExcelUtils.getCellData(i, 0).equals("")) {

			ExcelUtils.setCellDataUn(valueRelease(ExcelUtils.getCellData(i, 0)), i, 0, pathToFile);
			
			i++;
		}
		
		i = 1;
		while (!ExcelUtils.getCellData(i, 0).equals("")) {

			ExcelUtils.setCellDataUn(valueRelease(ExcelUtils.getCellData(i, 1)), i, 1, pathToFile);
			
			i++;
		}

	}

	public String valueRelease(String input) {

		String output = null;

		if (input.equals("minusFloat")) {
			output = Constant.minusFloat;
		}

		else if (input.equals("minusInt")) {
			output = Constant.minusInt;
		}

		else if (input.equals("plusFloat")) {
			output = Constant.plusFloat;
		}

		else if (input.equals("plusInt")) {
			output = Constant.plusInt;
		} else if (input.equals("zero")) {
			output = Constant.zero;
		}

		return output;

	}
}
