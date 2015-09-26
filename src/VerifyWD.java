import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class VerifyWD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		if(d.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Title matched");
			
		}
		else
			System.out.println("Title did not match:"+d.getTitle());
		
		d.quit();

	}

}
