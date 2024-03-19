package Pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Content_verification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
		
//driver.close();
		//driver.quit();
	}

}
