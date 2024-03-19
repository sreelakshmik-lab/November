package Pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpage_test {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test()
	{
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[4]")).click();
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmil.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.navigate().to("https://www.amazon.in");
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[7]")).click();
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
	}

}
