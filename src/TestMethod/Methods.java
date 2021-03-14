package TestMethod;

import java.io.FileInputStream;




import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	public WebDriver driver ;
	public FileInputStream f;
	public Workbook wb;
	public Sheet s;
	public void AppLaunch(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashk1234\\Desktop\\Framework\\jar\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
public void excel_con(String xlloc, String sname) throws Exception
{
	 f=new FileInputStream(xlloc);
	  wb=Workbook.getWorkbook(f);
	  s=wb.getSheet(sname);
	
}
public void title()
{
	System.out.println(driver.getTitle());
	
}
public void element_present(WebElement element)
{
	boolean a=element.isDisplayed();
	{
		if(a==true)
		{
			System.out.println(element.getText()  + " is present");
		}
	}
}
public void closeApp()
{
	driver.close();
}
}
