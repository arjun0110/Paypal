package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	
	String src = "./";
	Object[][] data = null ;
	

	public void readEcel() throws IOException
	{
		XSSFWorkbook wb = new XSSFWorkbook(src);
		XSSFSheet cursheet = wb.getSheetAt(0);
		
		int rowNum = cursheet.getLastRowNum();
		int lastCellNum = cursheet.getRow(0).getLastCellNum();
		
		data = new String [rowNum][lastCellNum];
		
		for(int i=0;i<rowNum;i++)
		{
			XSSFRow row = cursheet.getRow(i);
			
			for(int j=0;j<lastCellNum;j++) {
				
				String cellValue="";
				cellValue = row.getCell(j).getStringCellValue();
				
				data[i-1][j]=cellValue;
			}
		}
		
		
	}
	
	
}
