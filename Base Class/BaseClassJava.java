
package org.basee;



import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassJava {

	public static WebDriver driver;

	public static void getChromeDrive() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Loges\\eclipse-workspace\\NovemberrTestingCucumber2023\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	public static void getedgeDriver() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Loges\\eclipse-workspace\\NovemberrTestingCucumber2023\\driver\\msedgedriver.exe");

		driver = new EdgeDriver();
	}

	public  static void getDriver(String browserType) {

		switch (browserType) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Loges\\eclipse-workspace\\NovemberrTestingCucumber2023\\driver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();

			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Loges\\eclipse-workspace\\NovemberrTestingCucumber2023\\driver\\msedgedriver.exe");

			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;

		default:
			break;
		}

	}

	public static void getUrl(String url) {
		driver.get(url);
		
	}

	public static void textSendbyJava(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}

	public  static void selectByValue(WebElement element, String value) {

		Select s = new Select(element);
		s.selectByValue(value);
	}

	 public static void screenCapture (String name)throws IOException {
	       TakesScreenshot ts=(TakesScreenshot) driver;
		   
		   File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		   
		   File targetfile =new File ("D:\\New folder\\sk\\"+name+".png" );
		   		
		   
		   FileUtils.copyFile(sourcefile,targetfile);
		   
		   
	  }
	 
	public  static void textSendByJS(String keysToSend, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + keysToSend + "')", element);
	}

	public static String excelRead(int rownum, int cellnum) throws IOException {
		// To Locate The Path of the Workbook
		File filePath = new File("C:\\Users\\Loges\\sk\\Book1.xlsx");

		// To Get Datas from File as Input Datas
		FileInputStream stream = new FileInputStream(filePath); // throws FileNotFoundException

		Workbook book = new XSSFWorkbook(stream); // throws IOException

		// To get Sheet from workbook
		Sheet sheet = book.getSheet("Sheet1");

		// To get Row from sheet
		Row row = sheet.getRow(rownum);

		// To get Cell from Row
		Cell cell = row.getCell(cellnum);

		// To Find Cell Tyepe
		CellType cellType = cell.getCellType();
		String value = null;
		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
				value = simple.format(dateCellValue);

			} else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				value = valueOf.toString();

			}
			break;

		default:
			System.out.println("None");
			break;
		}
		
		return value;

	}

}
