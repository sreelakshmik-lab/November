package Utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {
	public static String getCellValues(String xl,String Sheet,int r,int c)
	{
		try
		{
			File f=new File(xl);
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFCell cell=(XSSFCell) wb.getSheet(Sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
			
		}
		catch(Exception e)
		{
			return "";
		}
	}
public static int getRowCount (String xl,String Sheet)
{
	return 0;
	
	
}
}
