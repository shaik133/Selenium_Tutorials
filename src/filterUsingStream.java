import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filterUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
		
		WebDriver driver=new ChromeDriver();
//Maximize the screen
		driver.manage().window().maximize();
//launch website
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
//type the rice in input form
		driver.findElement(By.id("search-field")).sendKeys("Rice");
//it will look for the 1st column of table
	List<WebElement> veg=	driver.findElements(By.xpath("//tr/td[1]"));
//it will filter only Rice from the first column and get the text 
List<WebElement> rice	=veg.stream().filter(vegi->vegi.getText().contains("Rice")).collect(Collectors.toList());
//using assertion checking whether filtered output is same as got text name
Assert.assertTrue(veg.equals(rice));
	}

}
