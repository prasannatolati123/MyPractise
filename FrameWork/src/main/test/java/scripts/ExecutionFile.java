package scripts;



import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import My.FrameWork.BrowserInitiation;

public class ExecutionFile extends BrowserInitiation{
	
	@Test
	public void test() throws Throwable {
		Properties p = new Properties();
		File file = new File("C:\\Users\\prasanna\\Desktop\\FrameWork\\FrameWork\\Properties\\Details.properties");
		FileInputStream fileInput = new FileInputStream(file);
		
		p.load(fileInput);
		
		String URL = p.getProperty("application.url");
		
		driver.get(URL);
		driver.manage().window().maximize();
		
		Reporter.log("Browser opened");
	}
	
	
}
