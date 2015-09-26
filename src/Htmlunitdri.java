import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class Htmlunitdri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd=new HtmlUnitDriver();
		
		wd.get("http://www.google.com");
		System.out.println("The title for google is:"+wd.getTitle());
		

	}

}
