import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("button.ui-datepicker-trigger")).click();
		
		//WebDriverWait w= new WebDriverWait(driver, 5);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.ui-state-default.ui-state-highlight")));
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
		
		 driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		 driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style");
		 if(driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style").contains("0.5")) {
			 System.out.println("Is disablesd");
			 Assert.assertTrue(true);
		 }
		 else {
			 Assert.assertTrue(false);
		 }
	}

}
