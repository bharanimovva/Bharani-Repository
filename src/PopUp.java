import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PopUp {

	public static void main(String[] args) throws InterruptedException{//Interrupted exc is for thread.sleep()
		// TODO Auto-generated method stub
		
		WebDriver d1=new FirefoxDriver();
		d1.manage().window().maximize();
		d1.get("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println(d1.getTitle());
		d1.findElement(By.name("txtUserName")).sendKeys("admin");
		d1.findElement(By.name("Submit")).click();
		Thread.sleep(2000L);
		
		Alert jsalert=d1.switchTo().alert();
		System.out.println(jsalert.getText());
		jsalert.accept();
		
		d1.findElement(By.name("txtPassword")).sendKeys("admin");
		d1.findElement(By.name("Submit")).click();
		System.out.println(d1.getTitle());
		
		d1.findElement(By.linkText("Logout")).click();
		d1.quit();
		
		

	}

}
