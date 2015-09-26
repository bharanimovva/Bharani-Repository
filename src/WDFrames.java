import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.Assert.assertTrue;
public class WDFrames {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver wd=new FirefoxDriver();
		wd.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		//Verifying title of the page
		assertTrue(wd.getTitle().matches("OrangeHRM - New Level of HR Management"));
		wd.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
		wd.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		wd.findElement(By.xpath("//input[@type='Submit']")).click();
		Thread.sleep(5000L);
		//Verifying text
		assertTrue(wd.findElement(By.xpath("//ul[@id='option-menu']/li")).getText().matches("Welcome admin"));
		//Selecting Frame
		wd.switchTo().frame("rightMenu");
		//Clicking on Add button
		wd.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
		wd.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		wd.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("aaa");
		Thread.sleep(2000L);
		wd.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("bbb");
		wd.findElement(By.xpath("//*[@id='btnEdit']")).click();
		Thread.sleep(2000L);
		System.out.println("Employee added");
		wd.switchTo().defaultContent();
		wd.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
		wd.quit();

	}

}
