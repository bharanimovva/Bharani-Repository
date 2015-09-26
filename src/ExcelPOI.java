import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelPOI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\arjun\\Selenium & Java\\HtmlProg\\WDPOI.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(fis);
		XSSFSheet s=w.getSheetAt(0);
		//XSSFSheet s=w.getSheet("Sheet1");
		XSSFRow row=s.getRow(1);
		XSSFCell cell=row.getCell(1);
		String cellValue=cell.getStringCellValue();
		System.out.println("Cell Value:"+cellValue);
		
		
		
		
		
		

	}

}
