/*package VariousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KeyboardEvent {
	
WebDriver driver ;
	
	@Before
	
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	
	public void loginTest() {
		WebElement user_filed_element = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement password_field_element = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		
		
		
		
		user_filed_element.sendKeys("demo@techfios.com");
		password_field_element.sendKeys("abc123");
		
	    Actions action = new Actions(driver);
	    action.sendKeys(Keys.ENTER).build().perform();
	    action.sendKeys(Keys.RETURN).build().perform();  //THE SAME WITH ENTER//BUILD PERFORM MEANS IT COMPILES AS IT RUN THE CODE
		
		
	}
}

*/

