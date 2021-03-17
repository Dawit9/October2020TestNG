/*package VariousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
  
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
		WebElement signin_button_element = driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
		
		
		
		user_filed_element.sendKeys("demo@techfios.com");
		password_field_element.sendKeys("abc123");
		signin_button_element.click();
		
		WebElement customer_button_element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span[1]"));
		WebElement add_customer_button_element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a"));
		
		
		customer_button_element.click();
		add_customer_button_element.click();
		
		
		WebElement Dropdown_Field_Element = driver.findElement(By.xpath("//select[@id='cid']")); 
		
		Select sel = new Select(Dropdown_Field_Element);
		sel.selectByVisibleText("Techfios");
	    // sel.getOptions();
		
	}
}
*/
