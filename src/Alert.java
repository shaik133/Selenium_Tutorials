import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//
//	List<WebElement> li=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
//	int sum=0;
//	
//		 for (int i=0; i<li.size();i++)
//		 {
//			 sum=sum+Integer.parseInt(li.get(i).getText());
//			 
//		 }
//		 System.out.println(sum);
//		
	////div[text()=' Total Amount Collected: 296 ']
		 
		 //String text= ' Total Amount Collected: 296 '
//		 
//		String text= driver.findElement(By.cssSelector("div[class='totalAmount']")).getText();
//		 System.out.println(text);
//		String value= text.split(":")[1].trim();
//		System.out.println(value);

Actions act = new Actions(driver);


	}

}
