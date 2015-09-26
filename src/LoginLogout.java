import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class LoginLogout {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.close();

	}

}
