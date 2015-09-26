import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\arjun\\Selenium & Java\\HtmlProg\\WDPOI.xlsx");
		XSSFWorkbook xw=new XSSFWorkbook(fis);
		XSSFSheet xs=xw.getSheet("Sheet1");
		System.out.println(xs.getSheetName());
		System.out.println(xs.getLastRowNum());
		
		XSSFRow row=xs.getRow(2);
		System.out.println("Current cell data:"+row.getCell(1));
		XSSFCell cell=row.getCell(1);
		cell.setCellValue("Hello World");
		fis.close();
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\arjun\\Selenium & Java\\HtmlProg\\WDPOI.xlsx");
		xw.write(fos);
		String cellValue=cell.getStringCellValue();
		System.out.println("Updated cell value:"+cellValue);
		fos.close(); 
		

	}

}
