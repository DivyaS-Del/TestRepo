package SeleniumClass;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
 
		//specify the location of the excel file
		File src= new File("C:\\Users\\Sharath_TP\\Downloads\\Exceldata.xlsx");
		
		//load the file
		FileInputStream fis =new FileInputStream(src);
		
		//load Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//load worksheet
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		//print the load sheet name
		System.out.println(sh.getSheetName());
		
		//print Selenium from excel sheet
		
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		
		//print Float/double from excel sheet
		
		System.out.println((float)sh.getRow(1).getCell(1).getNumericCellValue());
		
		//print integer from excel sheet
		System.out.println((int)sh.getRow(2).getCell(2).getNumericCellValue());
		
		//print total no of rows
		System.out.println("Total Rows:"+sh.getPhysicalNumberOfRows());
		System.out.println("Total Rows:"+sh.getLastRowNum()+1);
		
		//print total no of columns
		System.out.println("Total Columns:"+sh.getRow(1).getPhysicalNumberOfCells());
		System.out.println("Total Columns:"+sh.getRow(1).getLastCellNum());
		
		//Real time implementation
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
	       driver.get("https://facebook.com/");
		
	       // Enter username using excel file
	       String abc =sh.getRow(1).getCell(1).getStringCellValue();
	       driver.findElement(By.id("email")).sendKeys(abc);
	}

}
