package Pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dropdown {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		WebElement d=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select day=new Select(d);
		day.selectByIndex(0);
		
		WebElement m=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select month=new Select(m);
		month.selectByValue("1");
		
		WebElement y=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select year=new Select(y);
		year.selectByValue("2023");
		
		List<WebElement> li = day.getOptions();
		System.out.println("Count of days: " +li.size());
		List<WebElement> li1 = month.getOptions();
		System.out.println("Count of months: " +li1.size());
		List<WebElement> li2 = year.getOptions();
		System.out.println("Count of year: " +li2.size());
	}

}
