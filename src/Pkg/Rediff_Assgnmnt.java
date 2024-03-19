package Pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Assgnmnt {
	ChromeDriver driver;
	
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	{
		boolean logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("Displayed");
			
		}
		else
		{
			System.out.println("not");
		}
		boolean checkbox=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
		if(checkbox)
		{
			System.out.println("Checked");
		}
		else
		{
			System.out.println("unchecked");
		}
		boolean btn=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(btn)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
		
	}

}
