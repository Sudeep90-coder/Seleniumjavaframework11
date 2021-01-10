package Utils;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilities {

	
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
	
	
}
