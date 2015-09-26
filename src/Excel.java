import java.io.*;
import jxl.*;
public class Excel {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\arjun\\Selenium & Java\\HtmlProg\\WDJXL.xls");
		Workbook w1=Workbook.getWorkbook(fis);
		Sheet s1=w1.getSheet("Sheet1");
		System.out.println(s1.getName());
		int i=2;
		String EmpId=s1.getCell(0,i).getContents();
		String EmpName=s1.getCell(1,i).getContents();
		String EmpSal=s1.getCell(2,i).getContents();
		String EmpEmail=s1.getCell(3,i).getContents();
		String EmpPhno=s1.getCell(4,i).getContents();
		
		System.out.println("EmpID:"+EmpId);
		System.out.println("EmpName:"+EmpName);
		System.out.println("EmpSal:"+EmpSal);
		System.out.println("EmpEmail:"+EmpEmail);
		System.out.println("EmpPhNo:"+EmpPhno);
		
		fis.close();

	}

}
