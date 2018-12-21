package My.FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.google.inject.Inject;;

public class BrowserInitiation 
{
	@Inject
    public WebDriver driver ;
    
    @BeforeMethod
    public void getDriver() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasanna\\Desktop\\FrameWork\\FrameWork\\drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	System.out.println(driver);
    }
    
}
