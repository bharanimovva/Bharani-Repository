import java.io.*;

import jxl.*;

public class ExcelLoop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream f=new FileInputStream("C:\\Users\\arjun\\Selenium & Java\\HtmlProg\\WDJXL.xls");
		Workbook w=Workbook.getWorkbook(f);
		Sheet s=w.getSheet(0);
		int rows=s.getRows();
		for(int i=0;i<rows;i++)
		{
			String EmpId=s.getCell(0,i).getContents();
			String EmpName=s.getCell(1,i).getContents();
			String EmpSal=s.getCell(2,i).getContents();
			String EmpEmail=s.getCell(3,i).getContents();
			String EmpPhno=s.getCell(4,i).getContents();
			
			System.out.println("EmpID:"+EmpId);
			System.out.println("EmpName:"+EmpName);
			System.out.println("EmpSal:"+EmpSal);
			System.out.println("EmpEmail:"+EmpEmail);
			System.out.println("EmpPhNo:"+EmpPhno);
		}
		f.close();

	}

}
