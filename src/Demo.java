import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maadhu Rawal\\rv\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	 System.out.println(driver.getTitle());
	
	}

}
