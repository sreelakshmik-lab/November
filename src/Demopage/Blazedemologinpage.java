package Demopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemologinpage {
	WebDriver driver;
	By demoemail=By.id("email");
	By demopassword=By.id("password");
	By demologin=By.id("app");

	
	public Blazedemologinpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(demoemail).sendKeys(email);
		driver.findElement(demopassword).sendKeys(password);
		
	}
	public void login()
	{
		driver.findElement(demologin).click();
	}

}
