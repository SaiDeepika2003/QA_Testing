package selenium03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSLocators {

	public static void main(String[] args) {
		
		java.util.logging.Logger.getLogger("").setLevel(java.util.logging.Level.OFF);

        java.util.logging.Logger.getLogger("io.github.bonigarcia.wdm").setLevel(java.util.logging.Level.OFF);

        System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "off");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();//maximize the browser window
		
		//tag id  tag#id
		//tag is optional
		driver.findElement(By.cssSelector("input#email")).sendKeys("yash123@gmail.com");
		
		//tag classname  tag.classname
		
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Yashovardhan");
		//driver.findElement(By.cssSelector(".form-control")).sendKeys("Yashovardhan");
		
		//tag attribute
		driver.findElement(By.cssSelector("input[placeholder = \"Enter Phone\"]")).sendKeys("9876543210");
		//driver.findElement(By.cssSelector("[placeholder = 'Enter Phone']")).sendKeys("9876543210");
		
		//tag class attribute
		
		driver.findElement(By.cssSelector("input.form-check-input[id = 'monday']")).click();
		//driver.findElement(By.cssSelector(".form-check-input[id = 'monday']")).click();
	}

}
