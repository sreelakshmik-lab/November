package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drag_drop {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test1()
	{
		WebElement  src=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement dest=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest);
		act.perform();
		String text=dest.getText();
		if(text.equals("dropped"))
		{
			System.out.println("dropped");
		}
		else
		{
			System.out.println("not expected");
		}
	}
	

}
