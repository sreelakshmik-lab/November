package Pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown_test {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select ob=new Select(day);
		ob.selectByValue("02");
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select obj=new Select(month);
		obj.selectByIndex(1);
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select obje=new Select(year);
		obje.selectByVisibleText("2024");
		
		List<WebElement> li = ob.getOptions();
		System.out.println("Count of days:" +li.size());
		List<WebElement> li1 = obj.getOptions();
		System.out.println("Count of months:" +li1.size());
		List<WebElement> li2 = obje.getOptions();
		System.out.println("Count of years:" +li2.size());
	}
	
}
