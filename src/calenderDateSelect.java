import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderDateSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		Thread.sleep(2000L);
		
	boolean month= driver.findElement(By.cssSelector("div.datepicker-days th.datepicker-switch")).getText().contains("November");
		while(!month) {
			driver.findElement(By.cssSelector("div.datepicker-days th.next")).click();
			break;
		}
		
List<WebElement> dates=	driver.findElements(By.cssSelector(".day"));
int count= driver.findElements(By.cssSelector(".day")).size();
for (int i=0;i<count;i++) {
	String text=driver.findElements(By.cssSelector(".day")).get(i).getText();
	if(text.equalsIgnoreCase("27")) {
		driver.findElements(By.cssSelector(".day")).get(i).click();
		break;
	}
}
	}

}
