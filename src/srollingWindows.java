import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class srollingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 700)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		
// Sum the total no present inn table coulumn 4
		
//		List <WebElement> values= driver.findElements(By.cssSelector("#product td:nth-child(4)"));
//		int sum = 0;
//		for(int i=0; i<values.size();i++) {
//		sum=sum+Integer.parseInt(values.get(i).getText());
//		
//		}
//		System.out.println(sum);
//		
//		driver.findElement(By.cssSelector(".totalAmount")).getText();
//		int total= Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
//		
//		Assert.assertEquals(total, sum);
		
		List<WebElement> get=  driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int sum=0;
		for (int i=0;i<get.size();i++) {
			sum=sum+Integer.parseInt(get.get(i).getText());
		}
		System.out.println(sum);
//		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
//		
//		WebDriverWait w = new WebDriverWait(driver,5);
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".theme-btn.register-btn")));
//		
//		driver.findElement(By.cssSelector(".theme-btn.register-btn")).click();
	
	}
}
