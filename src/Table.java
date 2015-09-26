import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\arjun\\Selenium & Java\\HtmlProg\\HtmlProg\\getXpathCountandVerifyTable.html");
		int row=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr")).size();
		int col=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr[1]/td")).size();
		int rc=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr/td")).size();
		 System.out.println("Number of rows:"+row);
		 System.out.println("Number of columns:"+col);
		 System.out.println("Total number of rows by columns:"+rc);
		 
		String data1=driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
		System.out.println(data1);
		 for(int i=1;i<=row;i++)
		 {
			 for(int j=1;j<=col;j++)
			 {
				 String data=driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr["+i+"]/td["+j+"]")).getText();
				 System.out.println("Data["+i+"]["+j+"]"+data);
			 }
		 }
		 driver.close();
		 

	}

}
