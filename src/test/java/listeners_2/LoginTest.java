package listeners_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	 WebDriver driver = null;
	 static String expectedTitleebay ="Electronics, Cars, Fashion, Collectibles & More | eBay";
	 static String expectedTitledaraz ="Online Shopping Sri Lanka: Clothes, Electronics & Phones | Daraz.lk";

	@Test
	public void test1() {
		System.out.println("I am inside Test1");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.get("https://www.daraz.lk/#");
		
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitledaraz);
		
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("Mobile");
		driver.findElement(By.xpath("//*[@id=\"topActionHeader\"]/div/div[2]/div/div[2]/form/div/div[2]/button")).sendKeys(Keys.RETURN);	
		
		driver.quit();
		
	}

	@Test
	public void test2() {
		System.out.println("I am inside Test2");

		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
	 
		driver.manage().window().maximize();
	    driver.get("https://www.ebay.com");
	    
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(actualTitle, expectedTitleebay);
	    
	    driver.findElement(By.name("_nkw")).sendKeys("Mobile");
	    driver.findElement(By.id("gh-btn")).sendKeys(Keys.RETURN);
	    
		driver.quit();

	}

	@Test
	public void test3() {
		System.out.println("I am inside Test3");
		throw new SkipException("TestSkipped");
	}

	@Test
	public void test4() {
		System.out.println("I am inside Test4");
		Assert.assertTrue(false);
	}

}
