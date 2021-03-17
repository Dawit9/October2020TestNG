/*package VariousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

WebDriver driver ;
	
	@Before
	
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us/shop/monitors-monitor-accessories/ac/4009?~ck=mn");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	
	public void loginTest() throws InterruptedException {
		
		WebElement PRODUCT_BUTTON_ELEMENT = driver.findElement(By.xpath("//*[@id=\"l1\"]"));
		WebElement MONITOR_BUTTON_ELEMENT = driver.findElement(By.xpath("//span[text()=' Monitors']"));
		WebElement ALL_MONITOR_BUTTON_ELEMENT = driver.findElement(By.xpath("//span[text()='View all Monitors for Home']"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(PRODUCT_BUTTON_ELEMENT).build().perform();
		action.moveToElement(MONITOR_BUTTON_ELEMENT).build().perform();
		
		ALL_MONITOR_BUTTON_ELEMENT.click();
		
		WebElement MONITOR_ACCESERIES_BUTTON_ELEMENT = driver.findElement(By.xpath("//*[@id=\"snp-category-header\"]/div/div[2]/h1"));
		
	    Assert.assertEquals("Wrong page", "Monitors & Monitor Accessories", MONITOR_ACCESERIES_BUTTON_ELEMENT.getText());
		
		
		
		
		
	}
	
	
		
	}


*/
