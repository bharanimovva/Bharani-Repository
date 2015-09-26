import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RobotAnswerAlert {

	public static void main(String[] args) throws InterruptedException,AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arjun\\Selenium & Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\arjun\\Selenium & Java\\HtmlProg\\HtmlProg\\answerOnNextPrompt.html.html");
		driver.findElement(By.xpath("html/body/a")).click();
		Alert jsalert=driver.switchTo().alert();
		System.out.println(jsalert.getText());
		jsalert.sendKeys("Bhanu");
		Thread.sleep(2000L);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000L);
		System.out.println("Cursor moved to OK button");
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000L);
		System.out.println("Cursor moved to cancel button");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000L);
		System.out.println("Pressed cancel button");
		driver.close();
		
		
		

	}

}
