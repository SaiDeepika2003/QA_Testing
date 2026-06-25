package selenium02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		driver.manage().window().maximize();
		
		//name
		driver.findElement(By.name("")).sendKeys("");
		
		//id
		boolean logoDisplaystatus = driver.findElement(By.id("")).isDisplayed();
		System.out.println(logoDisplaystatus);
		
		//

	}

}
