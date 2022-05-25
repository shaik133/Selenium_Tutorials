import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class framesDragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
//Switching to frame		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
//using action class
		Actions a= new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination= driver.findElement(By.id("droppable"));
//performing dragdrop action		
		a.dragAndDrop(source, destination).build().perform();
//switching back to default screen		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Accept']")).click();
	System.out.println(driver.findElements(By.tagName("a")).size());
		
	}

}
