package Utils;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelutilities {

	// static final XSSFSheet sheet = null;
	public Excelutilities(String excelPath, String sheetName){
		//try {
		//XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
		//XSSFSheet sheet = workbook.getSheet(sheetName); 
	//}
	//	catch(Exception e){
	//		e.printStackTrace();
			
	//	}
	}
	
	
	 public static void main(String[] args) {
		getrowcount();
		getcelldatanumeric(1,1);
		getcelldatastring(0,0);
		
	}
	public static void getrowcount() {
		
		try {
			XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\sudee\\Documents\\Java workspace\\Seleniumjavaframework\\excel\\data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1"); 
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows:  " + rowcount);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	public static void getcelldatastring(int rowNum,int colNum) {
		   
		try {
			XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\sudee\\Documents\\Java workspace\\Seleniumjavaframework\\excel\\data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1"); 
			String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(celldata);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
          
	}
	public static void getcelldatanumeric(int rowNum,int colNum) {
		   XSSFWorkbook workbook;
		try {
			workbook = new XSSFWorkbook("C:\\Users\\sudee\\Documents\\Java workspace\\Seleniumjavaframework\\excel\\data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1"); 
			double celldata = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(celldata);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
       
	}
	
	
	
	
}
