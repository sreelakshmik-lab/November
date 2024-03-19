package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Fblogin;

public class Fbloginpagetest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		Fblogin ob=new Fblogin(driver);
		ob.setvalues("abc@gmail.com", "abc");
		ob.login();
	}

}
