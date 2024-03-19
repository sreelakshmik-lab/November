package Pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_search3 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test()
		{
			driver.findElement(By.name("name")).sendKeys("abc");
			driver.findElement(By.name("company")).sendKeys("companyname");
			driver.findElement(By.name("email")).sendKeys("abc@");
			driver.findElement(By.name("password")).sendKeys("bnm");
			driver.findElement(By.name("password_confirmation")).sendKeys("bnm");
			
	
		}
}
