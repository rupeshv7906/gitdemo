import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo2_ie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Maadhu Rawal\\rv\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	
	driver.get("https://www.facebook.com");
	 System.out.println(driver.getTitle());
	
	}

}
