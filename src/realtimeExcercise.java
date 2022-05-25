import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class realtimeExcercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
//1. Number of links present in the page.
	System.out.println(driver.findElements(By.tagName("a")).size());
	
//2. Now the requirement is count the number of links present in the footer.

	
	WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
System.out.println(footerdriver.findElements(By.tagName("a")).size());

//3. Now from the footer only to get the number of links present in first column ie: discounts coupons column.
	WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul[1]"));
System.out.println(columndriver.findElements(By.tagName("a")).size());

//4. Now the requirement is open each links in a new tab
for (int i=1; i<columndriver.findElements(By.tagName("a")).size();i++) {
	
	String links= Keys.chord(Keys.CONTROL,Keys.ENTER);
	
	columndriver.findElements(By.tagName("a")).get(i).sendKeys(links);
	Thread.sleep(2000);
}

// 5. Now the requirement is get the title of each links/tabs open.
	Set<String> windows =driver.getWindowHandles();
	Iterator <String> it= windows.iterator();
	while(it.hasNext()) {
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	

	}
}
