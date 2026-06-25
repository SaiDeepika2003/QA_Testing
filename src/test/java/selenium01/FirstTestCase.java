package selenium01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/*
 Test case
 --------------
 1) Launch browser(chrome)
 2) Open URL https://opensource-demo.orangehrmlive.com
 3) Validate title should be "OrangeHRM"
 4) Close browser
 */
public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Testing...");
		
		//Launch browser (chrome)
		//ChromeDriver driver = new ChromeDriver();
		
		java.util.logging.Logger.getLogger("").setLevel(java.util.logging.Level.OFF);

        java.util.logging.Logger.getLogger("io.github.bonigarcia.wdm").setLevel(java.util.logging.Level.OFF);

        System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "off");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		//2) Open URL https://opensource-demo.orangehrmlive.com
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		//3) Validate title should be "OrangeHRM"
		
		String action_title = driver.getTitle();
		
		if(action_title.contains("OrangeHRM"))
		{
			System.out.println("Test Passed");
			
			System.out.println("Title : "+ action_title);
			
		}
		else 
		{
			System.out.println("Test Failed");
		}
		
		Thread.sleep(3000);
		
        //4)close browser
		driver.close();
		//driver.quit();
	}

}
