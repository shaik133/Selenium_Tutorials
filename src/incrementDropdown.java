import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class incrementDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (int i=1; i<4; i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		for (int i=0; i<3; i++) {
			driver.findElement(By.id("hrefIncChd")).click();
			}
		
		for (int i=0; i<3; i++) {
			driver.findElement(By.id("hrefIncInf")).click();
			}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
	
	}
}
