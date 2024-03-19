package Demopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemoregister {
	WebDriver driver;
	By demoname=By.xpath("//*[@id=\"name\"]");
	By democompany=By.xpath("//*[@id=\"company\"]");
	By demoemail=By.xpath("//*[@id=\"email\"]");
	By demopassword=By.xpath("//*[@id=\"password\"]");
	By democonfirm=By.xpath("//*[@id=\"password-confirm\"]");
	By demoregister=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	public Blazedemoregister(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String name,String company,String email,String password,String confirmpassword)
	{
		driver.findElement(demoname).sendKeys(name);
		driver.findElement(democompany).sendKeys(company);
		driver.findElement(demoemail).sendKeys(email);
		driver.findElement(demopassword).sendKeys(password);
		driver.findElement(democonfirm).sendKeys(confirmpassword);
		
	}
	public void register()
	{
		driver.findElement(demoregister).click();
	}
	

}
