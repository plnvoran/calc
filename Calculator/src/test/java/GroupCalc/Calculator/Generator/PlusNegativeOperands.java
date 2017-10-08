package GroupCalc.Calculator.Generator;

import org.testng.annotations.Test;

import GroupCalc.Calculator.ExelUtility.Constant;
import GroupCalc.Calculator.ExelUtility.ExcelUtils;

public class PlusNegativeOperands {

	@Test
	public void f() throws Exception {

		String pathToFile = Constant.Path_TestData + Constant.File_Generator;

		ExcelUtils.setExcelFile(pathToFile, "Generator");
		int i = 1;
		while (!ExcelUtils.getCellData(i, 0).equals("")) {
			if (ExcelUtils.getCellData(i, 0).equals("zero"))
			{
				ExcelUtils.setCellDataUn("0", i, 0, pathToFile);
				
			}
			
			i ++;
		}

		

	}
}
