import org.apache.xalan.xsltc.compiler.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Screen;




public class Sikuli_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(1000L);
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000L);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//html/body/div[1]/div[2]/form/div[3]/div[1]/input[1]")).click();
		Thread.sleep(3000L);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Bhanu");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Rekha");
		
		
		Screen screen=new Screen();
		Pattern browse=new Pattern("C:\\Users\\arjun\\Selenium & Java\\SeleniumWebDriver\\Images\\browse.png");
		screen.wait(browse,10);
		screen.click(browse);
		
		
		

	}

}
