import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandleConcept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set <String> windows= driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parentId=it.next();
		String childId= it.next();
		driver.switchTo().window(childId);
	System.out.println	(driver.findElement(By.cssSelector("p.im-para.red")).getText());
	
	//Taking screen shot of web Element
	WebElement names= (driver.findElement(By.cssSelector("p.im-para.red")));
	names.getText();
File src	=names.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("D://Image.png"));
	}

}
