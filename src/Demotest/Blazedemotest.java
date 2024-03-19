package Demotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Demopage.Blazedemologinpage;

public class Blazedemotest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://blazedemo.com/login");
	}
	@Test
	public void test()
	{
		Blazedemologinpage ob=new Blazedemologinpage(driver);
		ob.setvalues("abc@gmail.com","abc");
		ob.login();
	}

}
