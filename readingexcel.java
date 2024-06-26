package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingexcel {

	public static void main(String[] args) throws IOException {
		String excelFilePath="C:\\Users\\thasleem\\Dropbox\\PC\\Desktop\\Book1.xlsx";
//String excelFilePath=".\\datafiles\\Book1.xlsx";
FileInputStream inputstream=new FileInputStream(excelFilePath);
XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
XSSFSheet sheet=workbook.getSheet("Sheet1");
int rows=sheet.getLastRowNum();
int cells=sheet.getRow(1).getLastCellNum();
 for(int r=0;r<=rows;r++)
 {
	 XSSFRow row=sheet.getRow(r);
	 for(int c=0;c<cells;c++)
	 {
		 XSSFCell cell=row.getCell(c);
		 
		switch( cell.getCellType())
		{
		case STRING : System.out.print(cell.getStringCellValue());break;
		case NUMERIC:System.out.print(cell.getNumericCellValue());break;
		case BOOLEAN :System.out.print(cell.getBooleanCellValue());break;
		}
		System.out.print(" | ");
	 }
		System.out.println();

 }
	}

}
