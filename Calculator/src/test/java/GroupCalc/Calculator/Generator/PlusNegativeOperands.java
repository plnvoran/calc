package GroupCalc.Calculator.Generator;

import org.testng.annotations.Test;

import GroupCalc.Calculator.ExelUtility.Constant;
import GroupCalc.Calculator.ExelUtility.ExcelUtils;

public class PlusNegativeOperands{
  
	
	@Test
  public void f() throws Exception {
  
	
		
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData2, "Sheet1");

			for (int i = 1; i < Constant.numberOfTests + 1; i++) {

				ExcelUtils.getCellData(i, 1);
				
				

					ExcelUtils.setCellData("Pass", i, 3);
				
				

					ExcelUtils.setCellData("Fail", i, 3);
				

			}
	}
}

		
  
