package Testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.Fbpage;
import Utilities.Excelutil;

public class Fbtest extends Baseclass
   {
	@Test
	public void verifyLoginWithValidCred() throws Exception
	{
		Fbpage p1=new Fbpage(driver);
		String x1="C:\\Users\\hp\\Documents\\data.xlsx";
		String sheet="Sheet1";
		int RowCount=Excelutil.getRowCount(x1, sheet);
		for(int i=1;i<=RowCount;i++)
		{
			String UserName=Excelutil.getCellValues(x1, sheet, i, 0);
			System.out.println("usernme==="+UserName);
			String Pwd=Excelutil.getCellValues(UserName, sheet, i, 1);
			p1.setvalues(UserName, Pwd);
			p1.login();
					
		}
		
	}

}
