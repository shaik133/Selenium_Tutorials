import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dunamiAssaignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
	String checkname=	driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
	System.out.println(checkname);
	WebElement Staticdropdown= driver.findElement(By.id("dropdown-class-example"));
	Select dropdown=new Select(Staticdropdown);
	dropdown.selectByVisibleText(checkname);
	driver.findElement(By.id("name")).click();
	driver.findElement(By.id("name")).sendKeys(checkname);
	driver.findElement(By.id("alertbtn")).click();
	System.out.println(	driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();

	}

}
