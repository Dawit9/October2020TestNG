/*package VariousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class IFrame {
	
WebDriver driver ;
	
	@Test
	
	public void init() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/8/docs/api/\r\n");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//locating the driver to the right frame we dealing with 
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.awt")).click();
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Adjustable")).click();
		
		driver.switchTo().parentFrame();
		
		Assert.assertEquals("absfada", "Interface Adjustable", driver.findElement(By.linkText("Adjustable")).getText());
		
		
		//driver.switchTo().parentFrame(
		//driver.switchTo().frame("classFrame");
		
		// need to assert it
		//driver.findElement(By.linkText("Interface Adjustable")).click(); 
		
	}
}	
		
	   
*/
	
	
