import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autosuggestiveDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Aus");
		WebDriverWait w= new WebDriverWait(driver, 3);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.ui-menu-item a")));
List<WebElement>options=driver.findElements(By.cssSelector("li.ui-menu-item a"));
for(WebElement option:options) {
	if(option.getText().equalsIgnoreCase("Austria")) {
		option.click();
		break;
	}
}


//Check box:

driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();

//Search

driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
