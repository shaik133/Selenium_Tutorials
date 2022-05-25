import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
//		
//		WebElement tabledriver= driver.findElement(By.cssSelector(".table-display"));
//	System.out.println(	tabledriver.findElements(By.tagName("th")).size());
//	System.out.println(	tabledriver.findElements(By.tagName("tr")).size());
//	System.out.println(tabledriver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());
		
//Auto Suggestive dropdown assignment:
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
List<WebElement> options=	driver.findElements(By.cssSelector("#ui-id-1 li"));
		for(WebElement option:options) {
			if (option.getText().equalsIgnoreCase("United Arab Emirates")) {
				option.click();
				break;
			}
		}
	}

}
