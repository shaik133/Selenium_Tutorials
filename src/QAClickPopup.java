import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
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
public class QAClickPopup {

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
		
		/*--------Switching windows approach --*/
//		Set<String> windows=driver.getWindowHandles();
//		Iterator<String> it=windows.iterator();
//		String parentId=it.next();
//		String childtId=it.next();
//		driver.switchTo().window(childtId);
		
	/*----- using elements approach */	
	List<WebElement> list=	driver.findElements(By.xpath("//div[@class='sumome-react-wysiwyg-move-handle']//div//input"));
	Thread.sleep(3000)	;
if (list.size()>0)
		{
			
			driver.findElement(By.xpath("//div[@class='sumome-react-wysiwyg-move-handle']//div//input")).sendKeys("HI There");
			driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		}
		
//		driver.findElement(By.xpath("//div[@class='sumome-react-wysiwyg-move-handle']//div//input")).sendKeys("HI There");
//		driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
//		
//		driver.switchTo().defaultContent();
//		
//		driver.findElement(By.xpath("//span[text()='Login']")).click();
//		
	}

}
