package VariousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CastingJava {
	
	WebDriver driver;
	@Before
	public void launchingBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https:/techfios.com/billing/?ng=login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
        @Test
        
		public void logintest(){
        	
        	WebElement USER_NAME = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        	WebElement Passworrd_FIELD = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        	WebElement SIGHNIN_BUTTON = driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
        	
        	USER_NAME.sendKeys("demo@techfios.com");
        	Passworrd_FIELD.sendKeys("abc123");
        	SIGHNIN_BUTTON.click();
        	
        	
        	JavascriptExecutor js = (JavascriptExecutor) driver;
        	js.executeScript("scroll(50,1500)");       	
        }
		
        //Storing Web Element
        //Element Library
        	

}

