import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FileUpload {

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
		
		WebElement fileInput = driver.findElement(By.xpath("html/body/form/div/div[1]/div[2]/input[6]"));
		fileInput.sendKeys("C:\\Users\\arjun\\FAV Wallpapers\\ganesh.jpg");
		Thread.sleep(2000L);
		System.out.println("Picture uploaded successfully");
		driver.findElement(By.xpath("//html/body/form/div/div[1]/div[2]/div[2]/input[1]")).click();
		Thread.sleep(4000L);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
		

	}

}
