 import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("C:\\Users\\arjun\\Selenium & Java\\HtmlProg\\HtmlProg\\goBackAndWait.html");
		driver.findElement(By.xpath("//html/body/form/select")).sendKeys("Microsoft");
		driver.findElement(By.xpath("//html/body/form/input")).click();
		
		Thread.sleep(3000L);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		Thread.sleep(3000L);
		driver.get("C:\\Users\\arjun\\Selenium & Java\\HtmlProg\\HtmlProg\\goBackAndWait.html");
		driver.findElement(By.xpath("//html/body/form/selec")).sendKeys("Google");
		driver.findElement(By.xpath("//html/body/form/input")).click();
		
		Thread.sleep(3000L);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		Thread.sleep(3000L);
		driver.get("http://jsbin.com/osebed/2");
		Select lstbox=new Select(driver.findElement(By.id("fruits")));
		lstbox.selectByVisibleText("Banana");
		Thread.sleep(1000L);
		System.out.println("Selected fruit is banana");
		lstbox.selectByIndex(1);
		Thread.sleep(1000L);
		System.out.println("Selected fruit is apple");
		
		String firstval=lstbox.getFirstSelectedOption().getText();
		System.out.println("First Value:"+firstval);
		driver.quit();
		
		
		
		
		
		

	}

}
