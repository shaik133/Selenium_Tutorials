import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokingEachLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//	WebElement footerdriver =	driver.findElement(By.id("gf-BIG"));
//	
////	System.out.println(driver.findElements(By.tagName("a")).size());
////WebElement links = 	footerdriver.findElement(By.cssSelector("div[id='gf-BIG'] tr td:nth-child(1)"));
////System.out.println(links.findElements(By.tagName("a")).size());
////for(int i=0;i<links.findElements(By.tagName("a")).size();i++) {
////	String a= Keys.chord(Keys.CONTROL,Keys.ENTER);
////	links.findElements(By.tagName("a")).get(i).sendKeys(a);
		
		
		//Handling scrolling of webpage

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 700)");
		js.executeScript("document.querySelector(\"div[class='tableFixHead']\").scrollTop=300");
		int Sum=0;
		List<WebElement>list= driver.findElements(By.xpath("//table[@id='product']//td[4]"));
		for(int i=0;i<list.size();i++) {
			Integer total=Integer.parseInt(list.get(i).getText());
			Sum=Sum+total;
		}
		System.out.println(Sum);
		
		
		int Total=0;
		List<WebElement>price=driver.findElements(By.cssSelector(".table-display tr td:nth-child(3)"));
		for(int i=0;i<price.size();i++) {
			Total=Total+Integer.parseInt(price.get(i).getText());
		}
		System.out.println(Total);
		
		
}
	



	}


