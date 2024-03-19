package Pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_pgm2 {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void titleverification()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String expected="Google";
		if(title.contains(expected))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	@After
	public void close()
	{
		driver.close();
	}

}
