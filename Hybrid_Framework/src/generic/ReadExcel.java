package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	public static String getdata(String sheet,int ro,int c)
	{
       String val=" ";
	try
       {
       FileInputStream fis = new FileInputStream("./Excel/Testdata.xlsx");
    Workbook book = WorkbookFactory.create(fis);
   Cell C = book.getSheet(sheet).getRow(ro).getCell(c);
	val=C.getStringCellValue();
       }
       catch(Exception e)
       {
	System.out.println("Unable to fetch data");
       }
       return val;
       
	}

}
