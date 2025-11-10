package com.coverFox.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Utility {
	
	public static void getScreenshot(WebDriver driver,String ScreenshotName) throws IOException
	{
	
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timeStamp=new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss").format(new Date());
		String path=System.getProperty("user.dir");
		File dest=new File(path+"\\screenshot\\"+ ScreenshotName+ "_" +timeStamp+ ".png" );
		System.out.println("taking screenshot and saving at location... "+dest);
		FileHandler.copy(src, dest);
		

	}
	
	public static void scrollIntoView(WebDriver driver,WebElement webElement)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",webElement);
		System.out.println("scrolling into view.. "+webElement.getText());
		
	}
	
	public static void waitForElementExplicitly(WebDriver driver,long waitTime,WebElement webElement)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(waitTime));
		wait.until(ExpectedConditions.visibilityOf(webElement));
		System.out.println("waiting for Element for "+ waitTime);


	}
	
	public static String readDataFromExcel(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\ACC\\eclipse-workspace\\coverfoxTesting\\src\\main\\resources\\testData\\testData.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet(sheetName);
		String data = mySheet.getRow(row).getCell(cell).getStringCellValue();
		System.out.println("reading data from excel "+data);
		return data;

	}
	
	public static String readDataFromPropertiesFile(String key) throws IOException
	{
		Properties properties=new Properties();
		FileInputStream myfile=new FileInputStream("C:\\Users\\ACC\\eclipse-workspace\\coverfoxTesting\\src\\main\\resources\\config\\config.properties");
		properties.load(myfile);
		String value = properties.getProperty(key);
		System.out.println("reading " + key + " and value is  " + value);
		return value;

	}
	
	public static void handleDropDownUsingVisibleText(WebElement element, String visibleText)
	{
		Select select=new Select(element);
		select.selectByVisibleText(visibleText);
		System.out.println("handling drop down, value is "+ visibleText);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
