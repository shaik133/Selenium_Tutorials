import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class RahulShettyLogInPage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
	//---------environmental variables-------------

//		Properties prop = new Properties();
//		
//		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Introduction\\src\\data.properties");
//		prop.load(fis);
		
		

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object

		WebDriver driver=new ChromeDriver();
/*	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//-------------selecting country(auto suggestive drop down)---------------
driver.findElement(By.id("autosuggest")).sendKeys("aus");
WebDriverWait w= new WebDriverWait(driver, 5);
w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.ui-menu-item a")));
List<WebElement> options=	driver.findElements(By.cssSelector("li.ui-menu-item a"));

for (WebElement option:options)
{
	if (option.getText().equalsIgnoreCase("Austria"))
	{
		option.click();
		break;
	}
}

//---------------Dynamic Drop down-----------------------------selecting departure and arrival cities----------

driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
driver.findElement(By.cssSelector("a[value='GAU']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("div#ctl00_mainContent_ddl_destinationStation1_CTNR a[value='PYG']")).click();

//--------------Calender date select----------------------
driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();

//--------------Dynamic drop down----------------------'

driver.findElement(By.id("divpaxinfo")).click();

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

for (int i=1; i<4;i++)
{
	driver.findElement(By.id("hrefIncAdt")).click();
}

for (int i=0; i<3; i++)
{
	driver.findElement(By.id("hrefIncChd")).click();
}

driver.findElement(By.id("btnclosepaxoption")).click();

//--------------------Select dropdown--------------



WebElement select1 = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));


Select dropdown = new Select(select1);
dropdown.selectByIndex(2);
System.out.println(dropdown.getFirstSelectedOption().getText());

//--------------Login button------------------

driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

*/
//		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//		Actions a= new Actions(driver);
//		a.moveToElement(driver.findElement(By.id("dropdown-class-example"))).click().build().perform();
//		a.click(driver.findElement(By.id("checkBoxOption1"))).build().perform();
		
		
// ------------------- Window handle concept-------------------
//		driver.get("https://www.facebook.com/");
//		
//		Actions a = new Actions(driver);
//		
//		
//		a.moveToElement(driver.findElement(By.id("email"))).sendKeys("csshaikjafarsadiq@gmail.com").build().perform();
//		driver.findElement(By.id("pass")).sendKeys("memyself");
//		a.moveToElement(driver.findElement(By.cssSelector("button[name='login']"))).click().build().perform();
//		
//		
//	Set<String> window=	driver.getWindowHandles();
//    Iterator<String> it	=window.iterator();
//   String parent= it.next();
//   String child= it.next();
//   driver.switchTo().window(child);
//   driver.findElement(By.cssSelector("svg.a8c37x1j.ms05siws.hwsy1cff.b7h9ocf4.em6zcovv")).click();
   
 //-----------------------------Frames-------------------------------------------  
	
//		driver.get("https://jqueryui.com/droppable/");
//	driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
//	
//	Actions a= new Actions(driver);
//	
//WebElement source	=driver.findElement(By.id("draggable"));
//WebElement destination =driver.findElement(By.id("droppable"));
//	a.dragAndDrop(source, destination).build().perform();
//	
//	driver.switchTo().defaultContent();
//	driver.findElement(By.linkText("Demos")).click();
//	
//	System.out.println("There are " +driver.findElements(By.tagName("a")).size() + " links present in page");
//	WebElement widgetDriver= driver.findElement(By.cssSelector(".widget-area"));
//	System.out.println("There are "+widgetDriver.findElements(By.tagName("a")).size()+ " present in widget area");
//	WebElement footerDriver= driver.findElement(By.cssSelector(".footer-site-links"));
//	System.out.println("No of liknks present in footer section are " +footerDriver.findElements(By.tagName("a")).size());
//	for (int i=1; i<footerDriver.findElements(By.tagName("a")).size(); i++)
//	{
//	String keys=	Keys.chord(Keys.CONTROL,Keys.ENTER);
//	footerDriver.findElements(By.tagName("a")).get(i).sendKeys(keys);
//	Thread.sleep(2000);
//	}
//	driver.close();
		

		//----------------Date calender automation---------------------
		
//		driver.get("https://www.path2usa.com/travel-companions");
//	driver.findElement(By.id("travel_date")).click();
//		boolean month= driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).getText().contains("December");
//		while(!month)
//		{
//			driver.findElement(By.cssSelector(".datepicker-days th.next")).click();
//			break;
//		}
//		
//		int count= driver.findElements(By.cssSelector(".datepicker-days td.day")).size();
//		
//		for (int i=0; i<count;i++)
//		{
//		String text=	driver.findElements(By.cssSelector(".datepicker-days td.day")).get(i).getText();
//		if(text.equalsIgnoreCase("25"))
//		{
//			driver.findElements(By.cssSelector(".day")).get(i).click();
//			break;
//		}
	//---
//boolean month= 	driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).getText().contains("Janaury 2022");
//
//while(!month)
//{
//	driver.findElement(By.cssSelector(".datepicker-days .next")).click();
//	break;
//		}
//
//int count= driver.findElements(By.cssSelector(".day")).size();
//for (int i=0; i<count; i++)
//{
//	String text= driver.findElements(By.cssSelector(".day")).get(i).getText();
//	if (text.equalsIgnoreCase("25"))
//	{
//		driver.findElements(By.cssSelector(".day")).get(i).click();
//		break;
//	}
//}

	//-------------------Handling scrolling of webpage----------------
	//-- to handle scrolling we have method called JavaScript Executor----
//	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//	JavascriptExecutor js=  (JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0,500)");
//	js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500");
	
	//-------------Handling Insecure HTTPS certificates--------------
//	
//		DesiredCapabilities c= DesiredCapabilities.chrome();
//		c.acceptInsecureCerts();
//		c.setCapability(CapabilityType.ACCEPT_SSL_CERTS, false);
//		ChromeOptions ch= new ChromeOptions();
//		ch.merge(c);
		
		
//----------------Taking Screen shot---------------
//	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//	
//	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(src, new File("E:\\ss.png"));
		
	//-------------------Handling broken Links-----------
		
//		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//	WebElement footerDriver= 	driver.findElement(By.id("gf-BIG"));
//	List<WebElement> links=	footerDriver.findElements(By.cssSelector("li.gf-li a"));
//	SoftAssert a= new SoftAssert();
//	for (WebElement link: links)
//	{
//	String url=	link.getAttribute("href");
//	HttpURLConnection conn	=(HttpURLConnection)	new URL(url).openConnection();
//	conn.getRequestMethod();
//	conn.connect();
//	int resp= conn.getResponseCode();
//	a.assertTrue(resp<400, "the broken link is "+link.getText()+" with the response code of "+resp);
//	}
//	a.assertAll();
	
//	for (WebElement link: links) 
//	{
//		String A= Keys.chord(Keys.CONTROL,Keys.ENTER);
//		driver.findElements(By.cssSelector("li.gf-li a")).get(0).sendKeys(A);
//	}
	//---------------------------streamin java--------------------
//	ArrayList<String> list = new ArrayList<String>();
//	list.add("jam");
//	list.add("just");
//	list.add("jaago");
//	list.add("null");
//	list.add("pull");
//	
//	Stream.of("jam","mam","misww","mrqqaa","kasaa").filter(s->s.length()>4).map(s->s.toUpperCase()).sorted(). forEach(s->System.out.println(s));
//////	int count = (int) list.stream().filter(s->s.startsWith("j")).count();
////	System.out.println(count);
////	int count=0;
////	for (int i=0; i<list.size();i++)
////	{
////	String n=list.get(i);
////	if (n.startsWith("j"))
////	{
////		count++;
////	}
////	}
////	
////	System.out.println(count);
//	
//	ArrayList<String> al= new ArrayList<String>();
//	al.add("cool");
//	al.add("mad");
//	al.add("lal");
//	
//	Stream<String>	concate= Stream.concat(list.stream(),al.stream());
//	List<String> li=concate.collect(Collectors.toList());
//	System.out.println(li);
//		
//		Assert.assertTrue(concate.anyMatch(s->s.equalsIgnoreCase("lal")));
		
//		int[] al= {1,3,5,2,1,5,3,6};
//		
//		List<int[]> list= Arrays.asList(al);
//		
//	List<int[]> s= 	list.stream().distinct().collect(Collectors.toList());
//	 
//	System.out.println(s);
//		
	//	--------- invoking multiple window tabs -------------
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		Thread.sleep(10000);
	Set<String>	 windows= driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		Thread.sleep(5000);
		driver.switchTo().window(childId);
		driver.findElement(By.cssSelector(".theme-btn.register-btn")).click();
	}
	
		
	}
	

