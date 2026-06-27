package selenium02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException{
		
		java.util.logging.Logger.getLogger("").setLevel(java.util.logging.Level.OFF);

        java.util.logging.Logger.getLogger("io.github.bonigarcia.wdm").setLevel(java.util.logging.Level.OFF);

        System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "off");
		
	    WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		
		driver.manage().window().maximize();
		
		//name
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		//id
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
		//id
		//boolean logoDisplaystatus = driver.findElement(By.id("shopping_cart_container")).isDisplayed();
		//System.out.println(logoDisplaystatus);
		
		//linktext & partialLinkText
        //driver.findElement(By.id("react-burger-menu-btn")).click();
        
        //Thread.sleep(5000);
        
        //driver.findElement(By.id("inventory_sidebar_link")).click();
		
        //driver.findElement(By.linkText("About")).click();
        
        //classname
        
        WebElement footer = driver.findElement(By.className("social"));

        List<WebElement> links = footer.findElements(By.tagName("a"));

        System.out.println("Total footer links: " + links.size());
        
        //tagname
        List<WebElement> Totallinks = driver.findElements(By.tagName("a"));
        
        System.out.println("total number of links: "+ Totallinks.size());
        
        
        List<WebElement> images = driver.findElements(By.tagName("img"));
        
        System.out.println("total number of images:"+images.size());
		

	}

}
