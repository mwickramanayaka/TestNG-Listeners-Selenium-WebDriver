package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.testng.SkipException;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGListenersTest {

	


	@Test
	public void test1() {
		System.out.println("I am inside Test1");

	}

	@Test
	public void test2() {
		System.out.println("I am inside Test2");
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	 
	    
	    driver.get("https://www.ebay.com");
	    
	    driver.findElement(By.name("_nkw")).sendKeys("Mobiles");
	    driver.findElement(By.name("hhh")).sendKeys("Mobiles");

	    
	    driver.findElement(By.id("gh-btn")).sendKeys(Keys.RETURN);
	    
		driver.quit();

	}

	@Test
	public void test3() {
		System.out.println("I am inside Test3");
		throw new SkipException("TestSkipped");
	}

}
