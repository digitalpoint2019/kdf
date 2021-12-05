package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class readextData {
	
	public static WebDriver driver;
	
	

	public static XSSFWorkbook workbook;
	
	public static XSSFSheet worksheet;
	public static XSSFCell cell;
	
	
	public static void readexcelData(String sPath, String sheetname) throws IOException
	
	{
		//
		FileInputStream fis = new FileInputStream(sPath);
		
		workbook = new XSSFWorkbook(fis);
		
		worksheet=workbook.getSheet(sheetname);
	}
	
	public static String readcellData(int rowNum, int colNum)
	
	{
		cell=worksheet.getRow(rowNum).getCell(colNum);
		
		String readcellValue=cell.getStringCellValue();
		return readcellValue;
		

}
}
