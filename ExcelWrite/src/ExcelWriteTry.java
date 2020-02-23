import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelWriteTry {

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", "G:\\Java_Software_Latest_version\\2.4 chrome driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		File f=new File("G:\\Java_Software_Latest_version\\LohithData.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
	
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheet("Sheet1");
	
		sheet1.getRow(0).createCell(2).setCellValue("dell");
		sheet1.createRow(1).createCell(2).setCellValue("dell3");
		//fis.close();
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		//fos.close();
		wb.close();
	}

}
