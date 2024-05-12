package exceloperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelex1 {

	public static void main(String[] args) throws IOException {
		String excelFilePath="C:\\Users\\thasleem\\Dropbox\\PC\\Desktop\\Book1.xlsx";
		File file = new File(excelFilePath);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh =wb.getSheetAt(0);
		XSSFRow row=sh.getRow(4);
		XSSFCell cell=row.getCell(1);
		String data= cell.getStringCellValue();
		System.out.println(data);
		String data11=wb.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
		System.out.println(data11);
		double data22=wb.getSheetAt(0).getRow(2).getCell(2).getNumericCellValue();
		System.out.println(data22);
		

	}

}
