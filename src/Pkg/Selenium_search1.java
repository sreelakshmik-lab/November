package Pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_search1 {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	
		public void test()
		{
			driver.findElement(By.name("q")).sendKeys("Selenium");
			driver.findElement(By.name("btnK")).click();
			//driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		}
	

}
