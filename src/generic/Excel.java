package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Constants{

public static String getCelldata
(String path ,String sheetname ,int row,int cell)
	{
	String v="";
	try{
		
	FileInputStream fis=new FileInputStream
			(xlpath);
Workbook wb=WorkbookFactory.create(fis);
Cell c = wb.getSheet(sheetname).getRow(row).getCell(cell);
	v=c.toString();
	
}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return v;	
		
	}
}
