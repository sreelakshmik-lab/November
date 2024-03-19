package Demotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Demopage.Blazedemoregister;

public class Blazedemotest_register {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test()
	{
		Blazedemoregister ob=new Blazedemoregister(driver);
		ob.setvalues("abc", "luminar", "abc@gmail.com", "abc", "abc");
		ob.register();
	}

}
