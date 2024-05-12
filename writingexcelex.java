package exceloperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class writingexcelex {

	static String expected_output = "https://www.saucedemo.com/inventory.html";
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(getData("LoginData",1,0));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(getData("LoginData",1,1));
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		String actual_output = driver.getCurrentUrl();
		if(actual_output.equals(expected_output))
		{
		System.out.println("Test case passed");
		}
		else
		{
		System.out.println("Test case failed");
		}
	}

	public static String getData(String sheet_name,int row_num,int cell_num) throws
	IOException
	{
	String path = ".\\datafiles\\Book1.xlsx";
	File file = new File(path);
	FileInputStream fis = new FileInputStream(file);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	//-------------------------------
	String data = 
	wb.getSheet(sheet_name).getRow(row_num).getCell(cell_num).getStringCellValue();
	return data;
	}
	public static String getData1(String sheet_name,int row_num,int cell_num) throws
	IOException
	{
	String path = ".\\datafiles\\Book1.xlsx";
	File file = new File(path);
	FileInputStream fis = new FileInputStream(file);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	//-------------------------------
	double data = 
	wb.getSheet(sheet_name).getRow(row_num).getCell(cell_num).getNumericCellValue();
	int data1 = (int)data;
	String datas= String.valueOf(data1);
	return datas;
	}
	}


