import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoComplete {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arjun\\Selenium & Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.navigate().to("https://www.google.com/?gws_rd=ssl");
		Thread.sleep(2000L);
		d1.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000L);
		d1.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000L);
		System.out.println("First time down arrow pressed");
		d1.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000L);
		System.out.println("Second time down arrow pressed");
		d1.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000L);
		System.out.println("Enter key pressed");
		d1.close();
		
				

	}

}
