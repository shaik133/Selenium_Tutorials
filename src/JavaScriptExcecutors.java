import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */

/**
 * @author Admin
 *
 */
public class JavaScriptExcecutors {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromeDriver100version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://qaclickacademy.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='sumome-react-wysiwyg-move-handle']//div//input"));
		if (list.size()>0)
		{
			driver.findElement(By.xpath("//div[@class='sumome-react-wysiwyg-move-handle']//div//input")).sendKeys("HI There");
			driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		}
		WebElement loginEle=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		WebElement scrollToview= driver.findElement(By.xpath("//a[contains(text(),'View all Courses')]"));
		highlgtBorder(loginEle, driver);
		//click(loginEle, driver);
		scrolltoView( scrollToview,  driver);
		//scrollDownPage(driver);
		System.out.println(getTitle(driver));
		System.out.println(innertext( driver));
		generateAlert(driver, "This is alert");
	}

	
	/* Javascript excecutors
	 * click operation
	 * Highlight the border of an element
	 * scroll down the page
	 * scrollto view 
	 * Get title of the page
	 * Get inner text of page
	 * Generate custom alert
	 * Refresh the page
	 * */
	
// Click operation using JS
	public static void click(WebElement ele, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
	}
	
	//Highlight the border of the element
	public static void highlgtBorder(WebElement ele, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red';", ele);
	}
	
	//Scroll down the page
	public static void scrollDownPage(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,600)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	//Scroll to view
	public static void scrolltoView(WebElement ele, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	
	public static String getTitle(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
			String title=js.executeScript("return document.title;").toString();
			return title;
	}
	
	public static String innertext(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String innerText=js.executeScript("return document.documentElement.innerText;").toString();
		return innerText;
	}
	
	public static void generateAlert(WebDriver driver, String message)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert("+message+");");
	}
}
